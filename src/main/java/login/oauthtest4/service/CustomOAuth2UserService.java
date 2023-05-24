//package login.oauthtest4.service;
//
//import com.amazonaws.services.s3.AmazonS3;
//import com.example.demo2.domain.User;
//import com.example.demo2.dto.Role;
//import jakarta.servlet.http.HttpSession;
//import lombok.RequiredArgsConstructor;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.oauth2.client.userinfo.DefaultOAuth2UserService;
//import org.springframework.security.oauth2.client.userinfo.OAuth2UserRequest;
//import org.springframework.security.oauth2.client.userinfo.OAuth2UserService;
//import org.springframework.security.oauth2.core.OAuth2AuthenticationException;
//import org.springframework.security.oauth2.core.user.DefaultOAuth2User;
//import org.springframework.security.oauth2.core.user.OAuth2User;
//import org.springframework.stereotype.Service;
//
//import java.util.*;
//
//@Service
//@RequiredArgsConstructor
//public class CustomOAuth2UserService implements OAuth2UserService<OAuth2UserRequest, OAuth2User> {
//    private final AmazonS3 amazonS3;
//
//    @Autowired
//    HttpSession httpSession;
//
//    @Override
//    public OAuth2User loadUser(OAuth2UserRequest userRequest) throws OAuth2AuthenticationException{
//
//        OAuth2UserService<OAuth2UserRequest,OAuth2User> delegate = new DefaultOAuth2UserService();
//        OAuth2User oAuth2User = delegate.loadUser(userRequest);
//
//        //서비스 구분을 위한 작업
//        String registrationId = userRequest.getClientRegistration().getRegistrationId();
//        String userNameAttributeName = userRequest.getClientRegistration().getProviderDetails().getUserInfoEndpoint().getUserNameAttributeName();
//
//        String email;
//        String name;
//        Map<String, Object> response = oAuth2User.getAttributes();
//        System.out.println(registrationId);
//        if(registrationId.equals("google")){
//            email = (String) response.get("email");
//            name = (String) response.get("name");
//        }else{
//            throw new OAuth2AuthenticationException("허용되지 않은 인증입니다.");
//        }
//
////        User user;
////        Optional<User> optionalUser = userRepository.findByEmail(email);
////
////        if(optionalUser.isPresent()){
////            user = optionalUser.get();
////        }else{
////            user = new User();
////            user.setEmail(email);
////            user.setRole(Role.ROLE_USER);
////            userRepository.save(user);
////        }
////        httpSession.setAttribute("user", user);
//
//
//
////        String bucketName = "capston-userlist";
//        String userId = UUID.randomUUID().toString();
//
////        List<S3ObjectSummary> objectSummaries = amazonS3.listObjects(bucketName).getObjectSummaries();
//
//        //기존에 존재하는 사용자 인지 확인
////        boolean objectExists = false;
////        for (S3ObjectSummary objectSummary : objectSummaries) {
////            String key = objectSummary.getKey();
////            if (key.equals(email)) {
////                S3Object s3Object = amazonS3.getObject(bucketName, email);
////                ObjectMetadata objectMetadata = s3Object.getObjectMetadata();
////                userId = objectMetadata.getUserMetaDataOf("user-id");
////                objectExists = true;
////                break;
////            }
////        }
//        User user = new User();
//        user.setId(userId);
//        user.setName(name);
//        user.setEmail(email);
//        user.setRole(Role.ROLE_USER);
//
////        if(!objectExists) {
////            // 데이터를 InputStream으로 변환
////            byte[] data = email.getBytes();
////            InputStream inputStream = new ByteArrayInputStream(data);
////
////            // 메타데이터로 정보 입력
////            ObjectMetadata objectMetadata = new ObjectMetadata();
////            objectMetadata.addUserMetadata("user-id", userId);
////            objectMetadata.addUserMetadata("name", name);
////            objectMetadata.addUserMetadata("email", email);
////            objectMetadata.addUserMetadata("Role", "ROLE_USER");
////
////            //업로드
////            amazonS3.putObject(
////                    new PutObjectRequest(bucketName, email, inputStream, objectMetadata)
////                            .withCannedAcl(CannedAccessControlList.PublicRead)
////            );
////        }
//        httpSession.setAttribute("user", user);
//        return new DefaultOAuth2User(
//                Collections.singleton(new SimpleGrantedAuthority(user.getRole().toString()))
//                , oAuth2User.getAttributes()
//                , userNameAttributeName);
//    }
//}
