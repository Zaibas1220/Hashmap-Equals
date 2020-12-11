public class RegistrationPlate {
    private final String regCode;
    private final String country;

    public RegistrationPlate(String regCode, String country) {
        this.regCode = regCode;
        this.country = country;
    }

    public String getRegCode() {
        return regCode;
    }

    public String getCountry() {
        return country;
    }

    @Override
    public String toString() {
        return country + " " + regCode;
    }

    public int hashCode() {
        if (this.regCode == null) {
            return 2;
        }

        return this.regCode.hashCode() + this.country.hashCode();
    }

    @Override
    public boolean equals(Object registrationPlate){
        if (registrationPlate == null) {
            return false;
        }

        if (getClass() != registrationPlate.getClass()) {
            return false;
        }

        RegistrationPlate compared = (RegistrationPlate) registrationPlate;

        if (this.country != compared.getCountry()) {
            return false;
        }

        if (this.regCode == null || !this.regCode.equals(compared.getRegCode())) {
            return false;
        }

        return true;
    }
}
