<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<script>
function chat(){
	window.open("notice_chat", "실시간 상담", "width=800,height=600");
}
</script>
<!-- sidebar -->
<aside class="col-lg-3 sidebar">
	<div class="widget">
		<div class="d-lg-block collapse" id="collapse-1">
			<span class="widget-title">고객센터</span>
			<div class="widget-content">
				<ul id="page-nav" class="nav flex-column nav-category">
					<li class="nav-item">
						<a class="nav-link" href="noticeList">공지사항</a>
					</li>
					<li class="nav-item">
						<a class="nav-link" href="notice_qna">자주묻는 질문</a>
					</li>
					<li class="nav-item">
						<a class="nav-link" href="notice_authPolicy">검수 기준</a>
					</li>
					<li class="nav-item">
						<a class="nav-link" onclick="chat()" style="cursor: pointer;">실시간 문의</a>
					</li>                    
				</ul>
			</div>
		</div>
	</div>
</aside>
<!-- /sidebar -->