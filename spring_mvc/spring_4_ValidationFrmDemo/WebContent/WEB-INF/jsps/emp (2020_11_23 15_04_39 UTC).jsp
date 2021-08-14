<!DOCTYPE html>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<title>Insert title here</title>

<style>
.error {
	color: #ff0000;
}
.errorblock {
	color: #000;
	background-color: #ffEEEE;
	border: 3px solid #ff0000;
	padding: 8px;
	margin: 16px;
}

</style>
</head>
<body>


	<form:form action="save_emp" modelAttribute="employee">
	<form:errors path="*" cssClass="errorblock" element="div" />
		<table>
			<tr>
				<td>EmpId</td>
				<td><form:input path="empId" />
					<form:errors path="empId" cssClass="error" />
				</td>
			</tr>
			<tr>
				<td>Name</td>
				<td><form:input path="name" />
					<form:errors path="name" delimiter="," cssClass="error" />					
				</td>
			</tr>
			<tr>
				<td>City</td>
				<td><form:input path="city" />
				<form:errors path="city" cssClass="error" />
				</td>
			</tr>
			<tr>
				<td>Email</td>
				<td><form:input path="email" />
					<form:errors path="email" cssClass="error" />
				</td>
			</tr>
			<tr>
				<td>Salary</td>
				<td><form:input path="salary" />
					<form:errors path="salary" cssClass="error" />
				</td></tr>
				<tr>
				<td>Age</td>
				<td><form:input path="age" />
					<form:errors path="age" cssClass="error" />
				</td>
			</tr>
			<tr>
				<td>Join Date</td>
				<td><form:input path="joinDate" />
					<form:errors path="joinDate" cssClass="error" />
				</td>
			</tr>
			<tr>
				<td>Company Url</td>
				<td><form:input path="companyUrl" />
					<form:errors path="companyUrl" cssClass="error" />
				</td>
			</tr>
			<tr>
				<td>Qualifications :</td>
				<td><form:select path="qualification" >
				<form:option value="BE">BE</form:option>
				<form:option value="BTech"></form:option>
				<form:option value="ME">ME</form:option>
				<form:option value="MTech">MTech</form:option>
				<form:option value="NT">Non of Above</form:option>
				</form:select>
					<form:errors path="qualification" cssClass="error" />
				</td>
			</tr>
			
			<tr>
				<td colspan="2" ><input type="submit" value="Submit" />
				</td>				
			</tr>
			
		</table>
	</form:form>
</body>
</html>