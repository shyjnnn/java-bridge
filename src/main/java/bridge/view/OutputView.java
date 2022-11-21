package bridge.view;

import bridge.domain.MoveResult;
import java.util.StringJoiner;

/**
 * 사용자에게 게임 진행 상황과 결과를 출력하는 역할을 한다.
 */
public class OutputView {

    /**
     * 현재까지 이동한 다리의 상태를 정해진 형식에 맞춰 출력한다.
     * <p>
     * 출력을 위해 필요한 메서드의 인자(parameter)는 자유롭게 추가하거나 변경할 수 있다.
     */
    public static void printMap() {
        System.out.println(createUpMap());
        System.out.println(createDownMap());
    }

    private static StringJoiner createUpMap(){
        StringJoiner stringjoiner = new StringJoiner("|", "[", "]");
        for (String history : MoveResult.history) {
            if (history == "U"){
                stringjoiner.add("O");
            }
        }
        if (MoveResult.step == "U"){
            stringjoiner.add("X");
        }
        return stringjoiner;
    }

    private static StringJoiner createDownMap(){
        StringJoiner stringjoiner = new StringJoiner("|", "[", "]");
        for (String history : MoveResult.history) {
            if (history == "D"){
                stringjoiner.add("O");
            }
        }
        if (MoveResult.step == "D"){
            stringjoiner.add("X");
        }
        return stringjoiner;
    }

    /**
     * 게임의 최종 결과를 정해진 형식에 맞춰 출력한다.
     * <p>
     * 출력을 위해 필요한 메서드의 인자(parameter)는 자유롭게 추가하거나 변경할 수 있다.
     */
    public void printResult() {
    }
}
