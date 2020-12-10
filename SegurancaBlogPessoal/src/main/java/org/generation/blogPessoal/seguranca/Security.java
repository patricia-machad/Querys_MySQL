package org.generation.blogPessoal.seguranca;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
@EnableWebSecurity
public class Security extends WebSecurityConfigurerAdapter {
	@Autowired
	private ImplementsUserDetailsService userDetailsService;

	@Override
	protected void configure(HttpSecurity http) throws Exception {

		// PERMITE O CADASTRO DE UM USUARIO
		http.csrf().disable().authorizeRequests().antMatchers(HttpMethod.GET, "/").permitAll()
				.antMatchers(HttpMethod.POST, "/cadastrar").permitAll()

				// CONCEDE AS PERMISSOES PARA O USUARIO ADMIN, PARA QUE ELE POSSA USAR OS END'S
				// POINT'S
				.antMatchers(HttpMethod.GET, "/cadastrarTema").hasRole("ADMIN")
				.antMatchers(HttpMethod.POST, "/cadastrarTema").hasRole("ADMIN")
				.antMatchers(HttpMethod.GET, "/formTema").permitAll().antMatchers(HttpMethod.POST, "/formTema")
				.hasRole("ADMIN").anyRequest().authenticated().and().formLogin().permitAll().and().logout()
				.logoutRequestMatcher(new AntPathRequestMatcher("/logout"));
	}

	//BARRA O USUARIO QUE NÃO POSSUE PERMISSÕES DO ADMIN
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(userDetailsService).passwordEncoder(new BCryptPasswordEncoder());
	}

}
