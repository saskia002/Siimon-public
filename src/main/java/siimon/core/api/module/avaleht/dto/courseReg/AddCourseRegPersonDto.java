package siimon.core.api.module.avaleht.dto.courseReg;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class AddCourseRegPersonDto {

	@Size(min = 1, max = 500, message = "Full name is required")
	private String fullName;

	@Email(message = "Mail must be a valid email")
   	@Size(min = 1, max = 500, message = "Mail is required")
	private String mail;

	@Pattern(regexp = "^(\\+372|\\+371)[5-9][0-9]{6,7}$", message = "Phone must be a valid phone number, EST or LVA format")
   	@Size(min = 1, max = 16, message = "Phone is required")
	private String phone;

	@Size(min = 1, max = 10, message = "Id code is required")
	private String idCode;

}
