/*
 * package com.dong.Board.Service;
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.security.core.userdetails.User; import
 * org.springframework.security.core.userdetails.UserDetails; import
 * org.springframework.security.core.userdetails.UserDetailsService; import
 * org.springframework.security.core.userdetails.UsernameNotFoundException;
 * import org.springframework.security.crypto.password.PasswordEncoder; import
 * org.springframework.stereotype.Service;
 * 
 * import com.dong.Board.dao.MemberDao; import
 * com.dong.Board.entity.MemberDetails;
 * 
 * @Service public class MemberService implements UserDetailsService {
 * 
 * 
 * @Autowired MemberDao memberDao;
 * 
 * @Autowired PasswordEncoder passwordEncoder;
 * 
 * 
 * public void loginCheck(Member member) {
 * System.out.println("ServiceLoginCheckBefore :" + member.getEmail());
 * memberDao.loginCheck(member); System.out.println("ServiceLoginCheckAfter :" +
 * member.getEmail()); }
 * 
 * 
 * @Override public UserDetails loadUserByUsername(String email) throws
 * UsernameNotFoundException { System.out.println("member받기 전" + email); User
 * user = memberDao.findByEmail(email);
 * 
 * if(user != null) { return new MemberDetails(user); }
 * 
 * 
 * return null; }
 * 
 * }
 */
