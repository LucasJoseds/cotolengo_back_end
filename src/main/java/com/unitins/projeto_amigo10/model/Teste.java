//package com.unitins.projeto_amigo10.model;
//
//import java.util.Collection;
//import java.util.Map;
//
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.oauth2.core.oidc.OidcIdToken;
//import org.springframework.security.oauth2.core.oidc.OidcUserInfo;
//import org.springframework.security.oauth2.core.oidc.user.OidcUser;
//
//public class Teste implements OidcUser {
//
//	private OidcUser oidcUser;
//    private Collection<? extends GrantedAuthority> authorities;
//
//    public Teste(OidcUser oidcUser, Collection<? extends GrantedAuthority> authorities) {
//        this.oidcUser = oidcUser;
//        this.authorities = authorities;
//    }
//
//    @Override
//    public Map<String, Object> getClaims() {
//        return oidcUser.getClaims();
//    }
//
//    @Override
//    public OidcUserInfo getUserInfo() {
//        return oidcUser.getUserInfo();
//    }
//
//    @Override
//    public OidcIdToken getIdToken() {
//        return oidcUser.getIdToken();
//    }
//
//    @Override
//    public Map<String, Object> getAttributes() {
//        return oidcUser.getAttributes();
//    }
//
//    @Override
//    public Collection<? extends GrantedAuthority> getAuthorities() {
//        return authorities;
//    }
//
//    @Override
//    public String getName() {
//        return oidcUser.getName();
//    }
//
//	@Override
//	public String toString() {
//		return "Teste [oidcUser=" + oidcUser + ", authorities=" + authorities + "]";
//	}
//
//	
//
//}
