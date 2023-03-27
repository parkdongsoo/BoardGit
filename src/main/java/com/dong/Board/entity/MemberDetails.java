/*
 * package com.dong.Board.entity;
 * 
 * import java.util.ArrayList; import java.util.Collection;
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.security.core.GrantedAuthority; import
 * org.springframework.security.core.userdetails.User; import
 * org.springframework.security.core.userdetails.UserDetails;
 * 
 * import lombok.Data;
 * 
 * @Data public class MemberDetails implements UserDetails {
 * 
 * 
 * private User user;
 * 
 * public MemberDetails(User user) { this.user = user; }
 * 
 * @Override public String getPassword() { // TODO Auto-generated method stub
 * return user.getPassword(); }
 * 
 * @Override public String getUsername() { // TODO Auto-generated method stub
 * return user.getUsername(); }
 * 
 * @Override public Collection<? extends GrantedAuthority> getAuthorities() {
 * 
 * Collection<GrantedAuthority> collect = new ArrayList<>(); collect.add(new
 * GrantedAuthority() {
 * 
 * @Override public String getAuthority() { // TODO Auto-generated method stub
 * return user.get(); } })
 * 
 * return null; }
 * 
 * @Override public boolean isAccountNonExpired() { // TODO Auto-generated
 * method stub return false; }
 * 
 * @Override public boolean isAccountNonLocked() { // TODO Auto-generated method
 * stub return false; }
 * 
 * @Override public boolean isCredentialsNonExpired() { // TODO Auto-generated
 * method stub return false; }
 * 
 * @Override public boolean isEnabled() { // TODO Auto-generated method stub
 * return false; }
 * 
 * }
 */
