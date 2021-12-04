
public class MainGameFrame {
	public MainGameFrame(String name) {
		//창 생성(창 활성화)
        //OneCard 실행
		//ai카드덱, user카드덱, 바닥에 있는 카드덱, 버려진 카드 덱 리스트 추가
        //턴관련 int 형 변수 turn = 0:ai, 1:user
        //start실행
	}
	public void start() {
		//댁 분배를 보여준다
	}
	public void showTurn() {
		//누구의 턴인지 보여준다<- 시간을 활용하여 버튼의 움직임 생성
	}
    public void deckClicked() {
		//턴을 확인 해당 플레이어에게 카드 맥이기
	}
	public void checkEnd() {
		//게임이 끝났는지 확인
	}
	public void update() {
		//전체적인 프레임 업데이트
		//게임이 끝났는지 확인
        //다음턴이 AI턴인지 확인
        //AI턴이면 ai.play()
	}
	public void showChangingButton() {
		//바꾸는 버튼 활성화 및 다른 버튼 클릭 막기    
	}
	public void eraseChangingButton() {
		//바꾸는 버튼 비활성화
	}
}
