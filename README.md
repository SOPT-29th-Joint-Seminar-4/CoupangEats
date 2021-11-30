합동세미나 4조 쿠팡이츠입니다!<br>
아래의 글은 [이 링크](https://gigantic-respect-681.notion.site/30e9048137564860b1564206c3834050)에서 보는 것이 더 편합니다.

# Contributor
<table align="center">
  <tr align="center">
    <td><a href="https://github.com/akimcse">김현아</a></td>
    <td><a href="https://github.com/WonJoongLee">이원중</a></td>
    <td><a href="https://github.com/garden0401">최정원</a></td>
  </tr>
  <tr align="center">
    <td><img src="https://github.com/akimcse.png" width="150"></td>
    <td><img src="https://github.com/WonJoongLee.png" width="150"></td>
    <td><img src="https://github.com/garden0401.png" width="150"></td>
  </tr>
    <tr align="center">
    <td>메인 뷰 하단</td>
    <td>메인 뷰 상단</td>
    <td>추천메뉴 뷰</td>
  </tr>
</table>

# 1. Git branch 전략

 전략이라는 단어로 말은 거창하지만 어려운 것은 아닙니다. 여러명이 한 프로젝트를 작업할 때 이 Git branch 전략을 사용한다면 보다 쉽게 프로젝트를 관리할 수 있습니다. 

 이번 프로젝트를 하면서 저희는 `main`, `develop`, `feat/~` 브랜치를 사용할 것입니다. 큰 프로젝트로 가면 조금 더 다양하게 브랜치 전략을 세우지만 지금은 이정도만 해도 충분할 것 같습니다. 보통 `feat` 브랜치에서 `develop`으로 pull request를 보내고, `develop`에서 `main`으로 pull request를 보냅니다. 

- `feat`
    - feat은 featue의 줄임말로 기능을 개발하는 브랜치입니다.
    - 브랜치 이름 양식은 **feat/<이슈내용>**입니다.
    - 메인화면 ui를 구현하는 작업이라면, `feat/main_ui` 이런식으로 브랜치를 생성할 수 있습니다.(11.13 업데이트 이슈 번호 추가하는 부분은 뺐습니다!)
- `develop`
    - develop은 default 브랜치로 `feat` 브랜치에서 작업이 완료되었을 때 작업한 내용을 바탕으로 pull request를 보내는 브랜치입니다.
    - 개발을 다 하시면, 개발이 되어 있는 `feat` 브랜치에서 `develop` 브랜치로 pull request를 보내시면 됩니다.
    - `feat` 브랜치는 여러 개이지만, `develop` 브랜치는 하나입니다.
- `main`
    - main 브랜치에서는 develop 브랜치에서 앱 개발이 완료되었을 때 main으로 pull request를 보냅니다.
    - 1.0.0버전 이후 버전이 변경될 때 develop 브랜치에서 main으로 pull request를 보냅니다.

# 2. 프로젝트 폴더링

 폴더를 깔끔하게 나누면 프로젝트가 커졌을 때 알아보기 쉽습니다.

![1](https://user-images.githubusercontent.com/57510192/142626087-c23f3abb-1dba-47d5-879a-28ee98e20694.png)

폴더는 위와 같이 나누었습니다.

- data : 서버 통신에 필요한 파일이 들어갑니다.
- ui : 화면(Activity, Fragment)를 구성하는 코드가 들어갑니다.
- util : 프로젝트 모든 곳에서 사용되는 코드가 들어갑니다.

![2](https://user-images.githubusercontent.com/57510192/142626135-5e0fb8a0-96de-4c46-8f88-6b954ad707f9.png)

 제일 많이 사용하시게 될 폴더가 ui 폴더일 것 같은데, ui 폴더는 위와 같이 화면별로 나누시면 됩니다.

# 3. 코드 형식(Code Convention)

 코드 형식을 모두 다루기에는 양이 너무 많기에 간단한 것만 몇 개 정리했습니다.

- xml id의 경우 textview면 `tv_`로 시작해주시면 되고, recyclerview면 `rv_` 이런식으로 시작하면 됩니다.
- 클래스명은 대문자, 변수명은 소문자로 시작합니다.
- 함수가 너무 커지면 외부로 빼주시면 좋습니다.

# 4. Commit, Pull Request 양식
![3](https://user-images.githubusercontent.com/57510192/142626262-8a297849-bd49-4813-bae1-ac01040ce62a.jpg)

 Commit은 자주하는 것이 좋습니다. Commit을 자주하는 것이 좋은 이유에는 여러가지가 있습니다. 그 중에서 대표적인 것은 특정 기능을 추가한 후, 앱이 제대로 동작하지 않을 때 해당 commit을 돌릴 수 있다는 점입니다. 보통은 기능단위로 해주면 좋은데, 초기에는 조금 더 크게 해주셔도 됩니다. 

## 커밋 메시지

 원래는 이슈까지 따서 커밋메시지에 이슈까지 작성해주는데... 사실상 저희는 일주일이라는 시간밖에 없기 때문에 해당 부분은 빼도록 하겠습니다. 그래서 커밋 메시지는 **[<Prefix>] 커밋 내용**과 같이 작성해주시면 됩니다. Prefix에는 아래와 같은 것이 있습니다.

- feat : 기능이 추가되었을 때 사용합니다.
- layout : UI개발을 했을 때 사용합니다.
- chore : 간단한 작업을 했을 때 사용합니다.
- docs : 문서 작업을 했을 때 사용합니다.
- fix : 버그를 고쳤을 때 사용합니다.

예시

- [feat] 메인 화면 서버 통신 구현
- [layout] Bottom navigation bar 구현

## Pull Request
![4](https://user-images.githubusercontent.com/57510192/142626282-cdc6b178-d7cf-4cab-9fd5-6943a6001770.png)

 Pull Request는 양식을 추가해두었습니다. 그래서 Pull Request 보낼 때 자동으로 아래의 양식으로 뜨는데 해당 부분에는 이 Pull Request(commit들)에서 어떤 작업을 하셨는지 적어주시면 됩니다. 여러가지인 경우 엔터를 누르시면 아래에 점이 하나 더 생깁니다.

---

이외에 궁금한 점 있으시면 카톡 주세요!
