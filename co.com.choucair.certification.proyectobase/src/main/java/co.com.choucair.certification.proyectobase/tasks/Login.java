package co.com.choucair.certification.proyectobase.tasks;

import co.com.choucair.certification.proyectobase.userinterface.ChoucairLoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Login implements Task {
    private String setUser;
    private String setPassword;

    public Login(String setUser, String setPassword) {
        this.setUser = setUser;
        this.setPassword = setPassword;
    }

    public static Login onThePage(String strUser, String strPassword) {

        return Tasks.instrumented(Login.class,strUser,strPassword);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(ChoucairLoginPage.LOGIN_BUTTON),
                Enter.theValue(setUser).into(ChoucairLoginPage.INPUT_USER),
                Enter.theValue((setPassword)).into(ChoucairLoginPage.INPUT_PASSWORD),
                Click.on(ChoucairLoginPage.Enter_BUTTON)
        );

    }
}
