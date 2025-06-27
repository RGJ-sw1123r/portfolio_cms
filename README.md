# portfolio_cms

본 프로젝트는 정적 포트폴리오 웹사이트에 동적 콘텐츠 관리 기능을 통합하기 위한 Spring Boot + SvelteKit 기반의 협업형 CMS 구축 프로젝트입니다.  
관리자 페이지를 통한 유연한 콘텐츠 제어를 목표로 하며, 실무 중심의 기술 구성을 지향합니다.  

---

## 🔧 Node.js 설치 (v22.17.0)

---

## 📁 프론트엔드 디렉토리로 이동

```bash
cd frontend
```

---

## 📦 의존성 설치

```bash
npm install
```

---

## 🚀 개발 서버 실행

```bash
npm run dev
```

---

## 💡 개발 철학 및 구조 방향

협업에서는 다양한 이유로 역할 간의 경계가 흐려지는 상황을 자주 경험하게 됩니다.  
이 프로젝트는 그러한 환경에서 얻은 교훈을 바탕으로, 역할 분리를 명확히 하는 구조적 설계 실험을 담고 있습니다.  

디자이너, 마크업, 개발 각각의 책임을 분리하며 현업의 협업지식 전달력이 가장 잘 드러날 수 있도록 설계했습니다.  

SvelteKit은 마크업과 프론트엔드 로직을 명확히 나누며, SSR 기반 구조를 자연스럽게 지원합니다.  

MyBatis를 통해 SQL의 명시성과 성능을 제어함으로써, 데이터 흐름을 서비스 코드에서 명확히 표현합니다.  

DB 트랜잭션 및 함수와 같은 블랙박스 구조는 최소화하고, 추적과 테스트가 가능한 코드 기반 로직을 우선합니다.  

> "마크업은 마크업답게, SQL은 SQL답게" 각 계층의 책임이 혼잡하지 않도록 설계하고, 직관적이고 명확한 흐름이 유지되는 시스템을 만들고자 합니다.  

---

## 🗂️ 프로젝트 구조

```
portfolio_cms/               
├── README.md                # 이 문서
├── build.gradle             # Spring Boot Gradle 설정
├── settings.gradle
├── src/
│   └── main/
│       └── java/            # 백엔드 Java 소스
│       └── resources/       
│           └── application.yml       # 민감 설정 (Git에 포함되지 않음)
├── frontend/                
│   ├── package.json         # 프론트엔드 패키지 설정
│   ├── vite.config.ts       # Vite 설정 (SvelteKit)
│   └── src/                 # SvelteKit 페이지 구성
└── .gitignore
```

---

