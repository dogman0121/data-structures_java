package lab19.ProfileData;

public class ProfileData {
    String name;
    String surname;
    String patronymic;
    Long INN;

    public ProfileData(String name, String surname, String patronymic, Long INN) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;

        if (!validateINN(INN))
            throw new WrongINNFormat("ВЫ дурачок");

        this.INN = INN;
    }

    public boolean validateINN(Long INN) {
        if (Long.parseLong("1000000000") <= INN && INN <= Long.parseLong("9999999999"))
            return true;
        return false;
    }
}
