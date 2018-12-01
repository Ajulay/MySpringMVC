<%@taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<html>
<head>
  <title>Employee</title>
</head>
<body>

<h2>Enter information about employee</h2>
<f:form method="post" action="addEmployee">
  <div>
    <f:label path="name">Name</f:label>
    <f:input path="name" />
  </div>
    <f:label path="sirname">Sirname</f:label>
    <f:input path="sirname" />
  <div>
    <f:label path="position">Position</f:label>
    <f:input path="position" />
  </div>
  <div>
    <input type="submit" value="Submit"/>
  </div>
</f:form>
</body>
</html>