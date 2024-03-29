package StepDefinitions;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

import StepsSerenity.commonSteps;
import StepsSerenity.loginUI_steps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class loginUI {

	@Steps
	static loginUI_steps loginUI_steps_object;
	static commonSteps commonSteps_object;

	@When("^Eye button is clicked \"([^\"]*)\"$")
	public void eye_button_is_clicked(String times) {
		if (times.equals("once")) {
			loginUI_steps_object.eye_button_clicked(1);
		} else if (times.equals("twice")) {
			loginUI_steps_object.eye_button_clicked(2);
		}
	}

	@When("^Forgot password link is clicked$")
	public void forgot_password_link_is_clicked() {
		loginUI_steps_object.forgot_password();
	}

	@When("^Contact EATON support representative link is clicked$")
	public void contact_eaton_support_representative_link_is_clicked() {
		loginUI_steps_object.eaton_support_link_open();
	}

//	@Then("^Login fails with error message \"([^\"]*)\"$")
//	public void login_fails_with_error_message_something(String errormessage) {
//		if (errormessage.contains(",")) {
//			String[] List_error = errormessage.split(",", 0);
//			for (int count = 0; count < List_error.length; count++) {
//				commonSteps_object.error_validation(List_error[count]);
//			}
//		} else {
//			commonSteps_object.error_validation(errormessage);
//		}
//	}

	@Then("^Login button is disabled$")
	public void login_button_is_disabled() {
		loginUI_steps_object.login_button_state_check();
	}

	@Then("^Password should be \"([^\"]*)\"$")
	public void password_should_be(String visibility) {
		loginUI_steps_object.password_visibility(visibility);
	}

	@Then("^Redirect to Forgot password page$")
	public void redirect_to_forgot_password_page() {
		loginUI_steps_object.forgot_password_page_opening_validation();
		loginUI_steps_object.back_from_forgot_password();
	}

	@Then("^Help section dialog box opens up$")
	public void help_section_dialog_box_opens_up() {
		loginUI_steps_object.help_section_dialog_box_opening_validation();
	}

	@Then("^Login successful with user redirected to dashboard$")
	public void login_successful_with_user_redirected_to_dashboard() {
		loginUI_steps_object.redirect_to_dashboard();
	}

	@Then("^Logout$")
	public void logout() {
		loginUI_steps_object.logout_of_application();
	}
}
