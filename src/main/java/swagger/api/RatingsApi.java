/**
 * NOTE: This class is auto generated by the swagger code generator program (2.3.1).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package swagger.api;

import swagger.model.RatingModel;
import swagger.model.ResponseMessage;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;

@Api(value = "ratings", description = "the ratings API")
public interface RatingsApi {

    @ApiOperation(value = "rating given by user for a particular movie.", nickname = "createRating", notes = "movie rating", response = ResponseMessage.class, tags={ "rating information", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Success", response = ResponseMessage.class),
        @ApiResponse(code = 400, message = "bad request", response = ResponseMessage.class),
        @ApiResponse(code = 500, message = "internal server error", response = ResponseMessage.class),
        @ApiResponse(code = 200, message = "default response message", response = ResponseMessage.class) })
    @RequestMapping(value = "/ratings",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    ResponseEntity<ResponseMessage> createRating(@ApiParam(value = "body of the movies" ,required=true )  @Valid @RequestBody RatingModel body);

}
