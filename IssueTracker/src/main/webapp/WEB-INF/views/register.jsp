
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>

<body>

	<c:choose>
		<c:when test="${ sessionScope.userLogged }">
			<p>Whoopsie, you wound up on our registration page, but you're
				already logged in!</p>
			<form method="POST" action="LogoutUserServlet">
				<input type="submit" value="Logout" class="register-button">
				<span class="welcome-register"><a href="./">Get Me Out of
						Here!</a></span>
			</form>
		</c:when>
		<c:otherwise>
			<h3>Register</h3>
			<span id="error-messages">${errormessage}</span>
			<form method="POST" action="registerUser">
				
				<c:if test="${requestScope.userexist}">
				<br>
					<p>Sorry, but that Username is not Available</p>
				</c:if>
				
				<c:if test="${requestScope.passwordNoMatch}">
				<br>
					<p>Passwords DO NOT Match!</p>
				</c:if>
				
				<input type="text" name="firstName" class="fa long-input"
					placeholder="First Name..." required><br /> <input
					type="text" name="lastName" class="fa long-input"
					placeholder="Last Name..." required><br /> <input
					type="text" name="username" class="fa long-input"
					placeholder="Create a username..." required><br /> <input
					type="email" name="email" class="fa long-input"
					placeholder="Enter Your Email..." required><br /> <input
					type="password" name="password" class="fa long-input"
					placeholder="Create a password..." required><br /> <input
					type="password" name="confirmedPassword" class="fa long-input"
					placeholder="Confirm password..." required><br /> <input
					type="submit" value="Register" class="register-button"> <br>
				<span class="welcome-register"><a href="login">Already a
						Member? Login Now</a></span> <br> <span class="welcome-register"><a
					href="./">Go Back Home</a></span>
			</form>
		</c:otherwise>
	</c:choose>


</body>
</html>