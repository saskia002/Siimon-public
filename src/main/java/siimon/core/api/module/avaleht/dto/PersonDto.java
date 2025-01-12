package siimon.core.api.module.avaleht.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class PersonDto {

	@Min(value = 0, message = "Id must be set")
	@Max(value = 1000000000, message = "Id must be less than 1000000000")
	private Integer id;

	@Size(min = 1, max = 500, message = "Full name is required")
	private String fullName;

	@Email(message = "Mail must be a valid email")
	@Size(min = 1, max = 500, message = "Mail is required")
	private String mail;

	@Pattern(regexp = "^(\\+372|\\+371)[5-9][0-9]{6,7}$", message = "Phone must be a valid phone number, EST or LVA format")
	@Size(min = 1, max = 16, message = "Phone is required")
	private String phone;

	@Size(min = 1, max = 11, message = "Id code is required")
	private String idCode;

}
