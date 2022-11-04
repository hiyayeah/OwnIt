<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width,initial-scale=1">
    <title>OwnIt</title>
    <!-- Favicon icon -->
    <link rel="icon" type="image/png" sizes="16x16" href="<%=request.getContextPath() %>/resources/admin/images/favicon.png">
    <!-- Custom Stylesheet -->
    <link href="<%=request.getContextPath() %>/resources/admin/css/style.css" rel="stylesheet">

</head>
<script type="text/javascript">
	
	function func1() {
		confirm('변경하시겠습니까?');
	}

</script>
<body>

    <!--*******************
        Preloader start
    ********************-->
    <div id="preloader">
        <div class="loader">
            <svg class="circular" viewBox="25 25 50 50">
                <circle class="path" cx="50" cy="50" r="20" fill="none" stroke-width="3" stroke-miterlimit="10" />
            </svg>
        </div>
    </div>
    <!--*******************
        Preloader end
    ********************-->

    
    <!--**********************************
        Main wrapper start
    ***********************************-->
    <div id="main-wrapper">

        <!--**********************************
            Nav header start
        ***********************************-->
        <div class="nav-header">
            <div class="brand-logo">
                <a href="index.html">
                    <b class="logo-abbr"><img src="<%=request.getContextPath() %>/resources/admin/images/logo.png" alt=""> </b>
                    <span class="logo-compact"><img src="<%=request.getContextPath() %>/resources/admin//images/logo-compact.png" alt=""></span>
                    <span class="brand-title">
                        <img src="<%=request.getContextPath() %>/resources/admin/images/logo-text.png" alt="">
                    </span>
                </a>
            </div>
        </div>
        <!--**********************************
            Nav header end
        ***********************************-->

        <!--**********************************
            Header start
        ***********************************-->
        <jsp:include page="../inc/top.jsp"></jsp:include>
        <!--**********************************
            Header end ti-comment-alt
        ***********************************-->

        <!--**********************************
            Sidebar start
        ***********************************-->
		<jsp:include page="../inc/sidebar_admin.jsp"></jsp:include>
        <!--**********************************
            Sidebar end
        ***********************************-->

        <!--**********************************
            Content body start
        ***********************************-->
        <div class="content-body" >

            <div class="row page-titles mx-0">
                <div class="col p-md-0">
                    <ol class="breadcrumb">
                        <li class="breadcrumb-item"><a href="javascript:void(0)">Dashboard</a></li>
                        <li class="breadcrumb-item active"><a href="javascript:void(0)">Home</a></li>
                    </ol>
                </div>
            </div>
            <!-- row -->
			<br>
            <div class="container-fluid">

				<!-- Table start -->
				<div class="col-lg-12">
                    <div class="card">
                        <div class="card-body">
                            <div class="card-title">
	                            <h2>Buying Product</h2>
	                        </div>
                            <!-- 검색기능 Start -->
	                        <form>
                                <div class="input-group mb-3" style="float: right; width: 250px;">
                                    <input type="text" class="form-control">
                                    <div class="input-group-append">
                                        <button class="btn btn-outline-dark" type="button">Search</button>
                                    </div>
                                </div>
                                <select class="form-control" style="float: right; width: 100px">
                                    <option selected="selected">전체</option>
                                    <option>고객명</option>
                                    <option>상품명</option>
                                </select>
	                        </form>
	                        <!-- 검색기능 End -->
                            <div class="table-responsive">
                            <hr>
                                <table class="table header-border">
                                    <thead>
                                        <tr>
                                            <th scope="col">#</th>
                                            <th scope="col">고객</th>
                                            <th scope="col">Product</th>
                                            <th scope="col">Price</th>
                                            <th scope="col">정산계좌</th>
                                            <th scope="col">Date</th>
                                            <th scope="col">Status</th>
                                            <th scope="col"></th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                        <tr>
                                            <td>1</td>
                                            <td>정채연</td>
                                            <td><a href="">Apple AirPods Max Silver</a></td>
                                            <td>633,000원</td>
                                            <td>카카오뱅크<br>1111-03-3333333</td>
                                            <td>22-11-01</td>
                                            <td>
                                            	<select class="custom-select col-6" id="inlineFormCustomSelect">
                                                    <option selected="selected">검수대기중</option>
                                                    <option value="1">판매반려</option>
                                                    <option value="2">판매승인</option>
                                                </select>
                                            </td>
                                            <td>
                                            	<button type="button" class="btn mb-1 btn-outline-dark" onclick="func1()">Apply</button>
                                            </td>
                                        </tr>
                                        <tr>
                                            <td>2</td>
                                            <td>Nancy</td>
                                            <td>J. Daniels</td>
                                            <td>@daniels</td>
                                            <td>하나은행<br>906-010000-23333</td>
                                            <td>22-10-30</td>
                                            <td>
                                            	<select class="custom-select col-6" id="inlineFormCustomSelect">
                                                    <option selected="selected">검수대기중</option>
                                                    <option value="1">판매반려</option>
                                                    <option value="2">판매승인</option>
                                                </select>
                                            </td>
                                            <td>
                                            	<button type="button" class="btn mb-1 btn-outline-dark" onclick="func1()">Apply</button>
                                            </td>
                                        </tr>
                                    </tbody>
                                </table>
	                            <hr>
	                        </div>
	                        
							<!-- 페이징 태그 START -->
							<div class="bootstrap-pagination">
								<nav>
									<ul class="pagination justify-content-center">
	                                       <li class="page-item disabled"><a class="page-link" href="#" tabindex="-1">Previous</a></li>
	                                       <li class="page-item"><a class="page-link" href="#">1</a></li>
	                                       <li class="page-item"><a class="page-link" href="#">2</a></li>
	                                       <li class="page-item"><a class="page-link" href="#">3</a></li>
	                                       <li class="page-item"><a class="page-link" href="#">Next</a></li>
									</ul>
								</nav>
							</div>
							<!-- 페이징 태그 END -->
							
	                    </div>
	                </div>
	            </div>
				<!-- table end -->
				
            </div>
            <!-- #/ container -->
        </div>
        <!--**********************************
            Content body end
        ***********************************-->
        
        
        <!--**********************************
            Footer start
        ***********************************-->
        <div class="footer">
            <div class="copyright">
                <p>Copyright &copy; Designed & Developed by <a href="https://themeforest.net/user/quixlab">Quixlab</a> 2018</p>
            </div>
        </div>
        <!--**********************************
            Footer end
        ***********************************-->
    </div>
    <!--**********************************
        Main wrapper end
    ***********************************-->

    <!--**********************************
        Scripts
    ***********************************-->
    <script src="<%=request.getContextPath() %>/resources/admin/plugins/common/common.min.js"></script>
    <script src="<%=request.getContextPath() %>/resources/admin/js/custom.min.js"></script>
    <script src="<%=request.getContextPath() %>/resources/admin/js/settings.js"></script>
    <script src="<%=request.getContextPath() %>/resources/admin/js/gleek.js"></script>
    <script src="<%=request.getContextPath() %>/resources/admin/js/styleSwitcher.js"></script>
    
    <script src="<%=request.getContextPath() %>/resources/js/vendor.min.js"></script>
    <script src="<%=request.getContextPath() %>/resources/js/app.js"></script>

</body>

</html>