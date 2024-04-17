import java.util.Arrays;
import java.util.Random;

public class 연산자문제_1 {
    public static void main(String[] args) {
        int[] lottoNumbers = generateLottoNumbers();
        System.out.println("로또 번호: " + Arrays.toString(lottoNumbers));
    }

    public static int[] generateLottoNumbers() {
        int[] numbers = new int[6];
        Random random = new Random();

        for (int i = 0; i < 6; i++) {
            // 1부터 45 사이의 랜덤한 숫자 생성
            int randomNumber = random.nextInt(45) + 1;
            
            // 생성된 숫자가 이미 배열에 있는지 확인하고 중복 제거
            while (contains(numbers, randomNumber)) {
                randomNumber = random.nextInt(45) + 1;
            }
            
            // 중복이 없는 숫자를 배열에 추가
            numbers[i] = randomNumber;
        }

        // 번호를 오름차순으로 정렬
        Arrays.sort(numbers);

        return numbers;
    }

    // 배열에 특정 값이 포함되어 있는지 확인하는 메서드
    public static boolean contains(int[] array, int key) {
        for (int value : array) {
            if (value == key) {
                return true;
            }
        }
        return false;
    }
}