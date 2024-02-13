
<form action="/login" method="post">
	<input type="hidden" name="${_csrf.parameterName}"
		value="${_csrf.token}" />
	<div class="mb-3">
		<label for="username" class="form-label">Usuario</label> <input
			type="text" class="form-control" id="username" name="username">
	</div>
	<div class="mb-3">
		<label for="password" class="form-label">Contraseña</label> <input
			type="password" class="form-control" id="password" name="password">
	</div>
	<button type="submit" class="btn btn-primary">Entrar</button>
</form>