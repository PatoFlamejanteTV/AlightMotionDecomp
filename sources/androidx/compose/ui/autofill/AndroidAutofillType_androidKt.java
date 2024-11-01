package androidx.compose.ui.autofill;

import Q5.x;
import R5.Q;
import androidx.autofill.HintConstants;
import androidx.compose.ui.ExperimentalComposeUiApi;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class AndroidAutofillType_androidKt {
    private static final HashMap<AutofillType, String> androidAutofillTypes = Q.j(x.a(AutofillType.EmailAddress, HintConstants.AUTOFILL_HINT_EMAIL_ADDRESS), x.a(AutofillType.Username, HintConstants.AUTOFILL_HINT_USERNAME), x.a(AutofillType.Password, HintConstants.AUTOFILL_HINT_PASSWORD), x.a(AutofillType.NewUsername, HintConstants.AUTOFILL_HINT_NEW_USERNAME), x.a(AutofillType.NewPassword, HintConstants.AUTOFILL_HINT_NEW_PASSWORD), x.a(AutofillType.PostalAddress, HintConstants.AUTOFILL_HINT_POSTAL_ADDRESS), x.a(AutofillType.PostalCode, HintConstants.AUTOFILL_HINT_POSTAL_CODE), x.a(AutofillType.CreditCardNumber, HintConstants.AUTOFILL_HINT_CREDIT_CARD_NUMBER), x.a(AutofillType.CreditCardSecurityCode, HintConstants.AUTOFILL_HINT_CREDIT_CARD_SECURITY_CODE), x.a(AutofillType.CreditCardExpirationDate, HintConstants.AUTOFILL_HINT_CREDIT_CARD_EXPIRATION_DATE), x.a(AutofillType.CreditCardExpirationMonth, HintConstants.AUTOFILL_HINT_CREDIT_CARD_EXPIRATION_MONTH), x.a(AutofillType.CreditCardExpirationYear, HintConstants.AUTOFILL_HINT_CREDIT_CARD_EXPIRATION_YEAR), x.a(AutofillType.CreditCardExpirationDay, HintConstants.AUTOFILL_HINT_CREDIT_CARD_EXPIRATION_DAY), x.a(AutofillType.AddressCountry, HintConstants.AUTOFILL_HINT_POSTAL_ADDRESS_COUNTRY), x.a(AutofillType.AddressRegion, HintConstants.AUTOFILL_HINT_POSTAL_ADDRESS_REGION), x.a(AutofillType.AddressLocality, HintConstants.AUTOFILL_HINT_POSTAL_ADDRESS_LOCALITY), x.a(AutofillType.AddressStreet, HintConstants.AUTOFILL_HINT_POSTAL_ADDRESS_STREET_ADDRESS), x.a(AutofillType.AddressAuxiliaryDetails, HintConstants.AUTOFILL_HINT_POSTAL_ADDRESS_EXTENDED_ADDRESS), x.a(AutofillType.PostalCodeExtended, HintConstants.AUTOFILL_HINT_POSTAL_ADDRESS_EXTENDED_POSTAL_CODE), x.a(AutofillType.PersonFullName, HintConstants.AUTOFILL_HINT_PERSON_NAME), x.a(AutofillType.PersonFirstName, HintConstants.AUTOFILL_HINT_PERSON_NAME_GIVEN), x.a(AutofillType.PersonLastName, HintConstants.AUTOFILL_HINT_PERSON_NAME_FAMILY), x.a(AutofillType.PersonMiddleName, HintConstants.AUTOFILL_HINT_PERSON_NAME_MIDDLE), x.a(AutofillType.PersonMiddleInitial, HintConstants.AUTOFILL_HINT_PERSON_NAME_MIDDLE_INITIAL), x.a(AutofillType.PersonNamePrefix, HintConstants.AUTOFILL_HINT_PERSON_NAME_PREFIX), x.a(AutofillType.PersonNameSuffix, HintConstants.AUTOFILL_HINT_PERSON_NAME_SUFFIX), x.a(AutofillType.PhoneNumber, HintConstants.AUTOFILL_HINT_PHONE_NUMBER), x.a(AutofillType.PhoneNumberDevice, HintConstants.AUTOFILL_HINT_PHONE_NUMBER_DEVICE), x.a(AutofillType.PhoneCountryCode, HintConstants.AUTOFILL_HINT_PHONE_COUNTRY_CODE), x.a(AutofillType.PhoneNumberNational, HintConstants.AUTOFILL_HINT_PHONE_NATIONAL), x.a(AutofillType.Gender, HintConstants.AUTOFILL_HINT_GENDER), x.a(AutofillType.BirthDateFull, HintConstants.AUTOFILL_HINT_BIRTH_DATE_FULL), x.a(AutofillType.BirthDateDay, HintConstants.AUTOFILL_HINT_BIRTH_DATE_DAY), x.a(AutofillType.BirthDateMonth, HintConstants.AUTOFILL_HINT_BIRTH_DATE_MONTH), x.a(AutofillType.BirthDateYear, HintConstants.AUTOFILL_HINT_BIRTH_DATE_YEAR), x.a(AutofillType.SmsOtpCode, HintConstants.AUTOFILL_HINT_SMS_OTP));

    @ExperimentalComposeUiApi
    private static /* synthetic */ void getAndroidAutofillTypes$annotations() {
    }

    public static final String getAndroidType(AutofillType autofillType) {
        String str = androidAutofillTypes.get(autofillType);
        if (str != null) {
            return str;
        }
        throw new IllegalArgumentException("Unsupported autofill type".toString());
    }

    @ExperimentalComposeUiApi
    public static /* synthetic */ void getAndroidType$annotations(AutofillType autofillType) {
    }
}
