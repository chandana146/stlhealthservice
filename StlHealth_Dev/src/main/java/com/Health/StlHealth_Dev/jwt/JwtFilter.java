package com.Health.StlHealth_Dev.jwt;

import java.io.IOException;

import com.Health.StlHealth_Dev.security.UserLoginDetails;
import com.Health.StlHealth_Dev.security.UserLoginDetailsService;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;


@Component
public class JwtFilter extends OncePerRequestFilter {

	@Autowired
	private JwtUtills jwtUtills;

	@Autowired
	private UserLoginDetailsService userLoginDetailsService;

	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
			throws ServletException, IOException {
		String auth = request.getHeader("Authorization");
		String token = null;
		String unique_id = null;
		if (auth != null && auth.startsWith("Bearer")) {
			token = auth.substring(6);
			unique_id = jwtUtills.getUniqueIdFromToken(token);
		}

		if (unique_id != null && SecurityContextHolder.getContext().getAuthentication() == null) {
			UserLoginDetails currentUser = (UserLoginDetails) userLoginDetailsService.loadUserByUsername(unique_id);

			UsernamePasswordAuthenticationToken userAuthToken = new UsernamePasswordAuthenticationToken(currentUser,
					null, currentUser.getAuthorities());
			userAuthToken.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
			SecurityContextHolder.getContext().setAuthentication(userAuthToken);
		}

		filterChain.doFilter(request, response);

	}

}
