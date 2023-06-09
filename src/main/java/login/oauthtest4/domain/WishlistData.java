package login.oauthtest4.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class WishlistData {  //위시리스트 등록시 필요한 데이터
    private List<String> imageBytes;
    private String userId;
}