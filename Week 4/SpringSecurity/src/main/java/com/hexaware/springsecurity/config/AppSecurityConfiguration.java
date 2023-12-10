package com.hexaware.springsecurity.config;

import java.security.AuthProvider;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
@EnableWebSecurity
public class AppSecurityConfiguration extends WebSecurityConfigurerAdapter
{
/*
	@Override
	@Bean
	protected UserDetailsService userDetailsService() 
	{
		List<UserDetails> users = new ArrayList<UserDetails>();
		users.add(User.withDefaultPasswordEncoder().username("Devanshu").password("zqaoplkjgh").roles("USER").build());
		users.add(User.withDefaultPasswordEncoder().username("Nishita").password("zqaoplkjgh").roles("ADMIN").build());

		return new InMemoryUserDetailsManager(users);
	}
*/
	@Autowired
	private UserDetailsService userDetailsService;
	
	public AuthenticationProvider authProvider()
	{
		DaoAuthenticationProvider provider =	new DaoAuthenticationProvider();
		provider.setUserDetailsService(userDetailsService);
		provider.setPasswordEncoder(NoOpPasswordEncoder.getInstance());
		return provider;
	}
}
