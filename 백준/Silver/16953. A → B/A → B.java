import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	// A를 B로 바꾸는 연산 횟수 구하는 문제
	// 2를 곱해줌, 1을 맨 우측에 추가
	// 연산의 최솟값에 +1, 불가능하면 -1

	// 내가 생각한 방법
	// B -> A 로 가먄서 2의 배수인지에 따라 cnt 값 계산

	static int A, B;
	static int cnt;

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		A = Integer.parseInt(st.nextToken());
		B = Integer.parseInt(st.nextToken());

		System.out.println(AtoB(A, B));

	}

	static int AtoB(int A, int B) {

		cnt = 1;

		while (B > A) {

			if (B % 2 == 0) {
				B /= 2;
				cnt++;
			} else if (B % 10 == 1) {
				B /= 10;
				cnt++;
			} else {
				return -1;
			}

		}

		if (A == B)
			return cnt;
		else
			return -1;

	}

}
