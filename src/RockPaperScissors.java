import java.util.Scanner;

public class RockPaperScissors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int AMDscore = 0;
		int INTELscore = 0;
		int ALLscore = 0;
		int AwpTime = 0;

		Scanner scanner = new Scanner(System.in);
		
	
			System.out.println("A : 가위(1) 바위(2) 보(3)중 하나를 내주세요");
			int amd = scanner.nextInt();

			System.out.println("B : 가위(1) 바위(2) 보(3)중 하나를 내주세요");
			int intel = scanner.nextInt();

			switch (amd) {

			case 1:

				if (amd == 1)
					if (intel == 3) {
						System.out.println("A의 승리!(a=가위 b=보)");

						AMDscore++;
						break;
					}

			case 2:
				if (amd == 1)
					if (intel == 2) {
						System.out.println("B의 승리!(a=가위 b=바위)");

						INTELscore++;
						break;
					}

			case 3:
				if (amd == 2)
					if (intel == 3) {
						System.out.println("B의 승리!(a=바위 b=보)");

						INTELscore++;
						break;
					}

			case 4:
				if (amd == 2)
					if (intel == 1) {
						System.out.println("A의 승리!(a=바위 b=가위)");

						AMDscore++;
						break;
					}

			case 5:
				if (amd == 3)
					if (intel == 1) {
						System.out.println("b의 승리!(a=보 b=가위)");

						INTELscore++;
						break;
					}

			case 6:
				if (amd == 3)
					if (intel == 2) {
						System.out.println("a의 승리!(a=보 b=바위)");

						AMDscore++;
						break;
					}
			case 7:
				if (amd == intel) {
					System.out.println("두 값이 동일합니다");
					ALLscore++;
					break;
				}else if(ALLscore == 3) {
					System.out.println("3번 비기셧습니다");
					scanner.close();
					break;
				}
				/*
			case 8:

				if (AMDscore == 3) {
					System.out.println("3번 a가 승리 하엿습니다");
					scanner.close();
					break;
				}

			case 9:

				if (INTELscore == 3) {
					System.out.println("3번 b가 승리 하엿습니다");
					scanner.close();
					break;
				}

			case 10:

				if (ALLscore == 3) {
					System.out.println("3번 비기셧습니다");
					scanner.close();
					break;
				}
				*/

			default:
				System.out.println("알수없는 값이 나왔습니다");
				break;
			}

		}

	}

//}
