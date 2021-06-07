<%@ include file="header.jsp" %>

</div>
<br>
<div class="container">
  <div class="row">
    <div class="col">
      <ol class="breadcrumb">
    <li class="breadcrumb-item"><a href="#">Accueil</a></li>
    <li class="breadcrumb-item active" aria-current="page">Library</li>
  </ol>
    </div>
    <div class="col">
      <form class="d-flex" action="etatcivil" method="get" id="seachEtatCivilForm">
      <input type="hidden" id="searchAction" name="searchAction" value="searchByName">
      <input name="search" id="search" class="form-control me-2" type="search" placeholder="Search" aria-label="Search">
      <button class="btn btn-outline-primary" type="submit">Search</button>
    </form>
    </div>
  </div>
</div>





<!--Etat Civil List-->
            <c:if test="${not empty message}">                
                <div class="alert alert-success">
                    ${message}
                </div>
            </c:if> 
            <form action="etatcivil" method="post" id="etatcivilForm" role="form" >              
                <input type="hidden" id="idEtatCivil" name="idEtatCivil">
                <input type="hidden" id="action" name="action">
                <c:choose>
                    <c:when test="${not empty etatcivilList}">
                        <table  class="table table-striped">
                            <thead>
                                <tr>
                                    <td>#</td>
                                    <td>Name</td>
                                    <td>Last name</td>
                                    <td>Birth date</td>
                                    <td>Role</td>
                                    <td>Department</td>
                                    <td>E-mail</td>
                                    <td></td>
                                </tr>
                            </thead>
                            <c:forEach var="employee" items="${employeeList}">
                                <c:set var="classSucess" value=""/>
                                <c:if test ="${idEmployee == employee.id}">                        	
                                    <c:set var="classSucess" value="info"/>
                                </c:if>
                                <tr class="${classSucess}">
                                    <td>
                                        <a href="employee?idEmployee=${employee.id}&searchAction=searchById">${employee.id}</a>
                                    </td>                                    
                                    <td>${employee.name}</td>
                                    <td>${employee.lastName}</td>
                                    <td>${employee.birthDate}</td>
                                    <td>${employee.role}</td>
                                    <td>${employee.department}</td>
                                    <td>${employee.email}</td>   
                                    <td><a href="#" id="remove" 
                                           onclick="document.getElementById('action').value = 'remove';document.getElementById('idEmployee').value = '${employee.id}';
                                                    
                                                    document.getElementById('employeeForm').submit();"> 
                                            <span class="glyphicon glyphicon-trash"/>
                                        </a>
                                                   
                                    </td>
                                </tr>
                            </c:forEach>               
                        </table>  
                    </c:when>                    
                    <c:otherwise>
                        <br>           
                        <div class="alert alert-info">
                            No people found matching your search criteria
                        </div>
                    </c:otherwise>
                </c:choose>                        
            </form>
            <form action ="employee" method="get"> 
            <input type="hidden" id="searchAction" name="searchAction" value="new">        
                <br></br>
                <button type="submit" class="btn btn-primary  btn-md">New employee</button> 
            </form>




<%@ include file="footer.jsp" %>