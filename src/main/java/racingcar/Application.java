package racingcar;

import racingcar.io.ProgramOutput;
import racingcar.io.UserInput;

public class Application {
    private final ProgramOutput output;
    private final UserInput input;

    public Application() {
        this.output = new ProgramOutput();
        this.input = new UserInput();
    }

    public void run() {
        output.requestCarsName();
        ParticipatingCars cars = input.getCars();

        output.requestGameCount();
        int gameCount = input.getGameCount();

        output.printGameResult(cars, gameCount);
    }

    public static void main(String[] args) {
        // TODO: 프로그램 구현
        Application racingGame = new Application();
        racingGame.run();


    }
}
