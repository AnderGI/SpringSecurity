
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="jakarta.tags.core" prefix="c"%>
<header>
	<section
		class="d-flex flex-row justify-content-between align-items-center px-5 py-4 bg-white">
		<div class="col-3">
			<nav>
				<ul
					class="d-flex flex-row justify-content-start align-items-center list-unstyled">
					<li class><a href="/"
						class="px-5 font-weight-bold text-decoration-none text-dark">
						<c:if test="${empty usuario}">Página Principal</c:if>
						<c:if test="${not empty usuario}">${usuario }</c:if>
						
					</a></li>
				</ul>
			</nav>
		</div>
		<div class="col-6">
			<nav>
				<ul
					class="d-flex flex-row justify-content-center align-items-center list-unstyled">
					<li class><a href="/records"
						class="px-5 font-weight-bold text-decoration-none text-dark">Ejemplo</a></li>
					<li><a href="/p2"
						class="px-5 font-weight-bold text-decoration-none text-dark">Página
							2</a></li>
					<li><a href="/p3"
						class="px-5 font-weight-bold text-decoration-none text-dark">Página
							3</a></li>
				</ul>
			</nav>
		</div>
		<div class="col-3">
			<nav>
				<ul
					class="d-flex flex-row justify-content-end align-items-center list-unstyled">
					<li class="px-2"><c:if test="${empty usuario}">
							<a href="/login" class="px-3 btn btn-outline-primary btn-sm">Login</a>
						</c:if></li>
					<c:if test="${not empty usuario}">
						<li class="px-2">
							<form action="/logout" method="post">
								<input type="hidden" name="${_csrf.parameterName}"
									value="${_csrf.token}" />
								<button type="submit" class="px-3 btn btn-outline-danger btn-sm">Logout</button>
							</form>
						</li>
					</c:if>
				</ul>
			</nav>
		</div>
	</section>
</header>