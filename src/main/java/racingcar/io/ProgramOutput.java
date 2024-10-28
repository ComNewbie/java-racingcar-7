package racingcar.io;

import racingcar.Car;
import racingcar.ParticipatingCars;

import java.util.List;

public class ProgramOutput {
    private static final String REQUEST_CARS_NAME_MESSAGE = "경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)";
    private static final String REQUEST_GAME_COUNT_MESSAGE = "시도할 회수는 몇회인가요?";
    private static final String EXECUTION_RESULT_INFORMATION_MESSAGE = "실행 결과";
    private static final String COLON = " : ";

    public void requestCarsName() {
        System.out.println(REQUEST_CARS_NAME_MESSAGE);
    }

    public void requestGameCount() {
        System.out.println(REQUEST_GAME_COUNT_MESSAGE);
    }

    public void printGameResult(ParticipatingCars cars, int gameCount) {
        System.out.println(EXECUTION_RESULT_INFORMATION_MESSAGE);
        for (int currentGame = 0; currentGame < gameCount; currentGame++) {
            List<Car> racingCars = cars.racing();
            printCarResult(racingCars);
            printNewLine();
        }
    }

    private void printCarResult(List<Car> racingCars) {
        for (Car result : racingCars) {
            System.out.print(result.getName() + COLON + result.getPositionSign().toString());
            printNewLine();
        }
    }

    private void printNewLine() {
        System.out.println();
    }
}
