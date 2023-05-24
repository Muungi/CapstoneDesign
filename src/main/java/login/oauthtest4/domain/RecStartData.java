package login.oauthtest4.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RecStartData {
    //@JsonProperty("imageUrls")
    private List<String> imageUrls;

    private List<String> paths;
    //@JsonProperty("userId")
    private String userId;

    //@JsonProperty("season")
    private String season;

}