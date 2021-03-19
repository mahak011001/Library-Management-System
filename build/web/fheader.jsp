<%
    if(session.isNew())
    {
        response.sendRedirect("flogin.jsp");
    }
%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">

<style>
body {
  font-family: Arial, Helvetica, sans-serif;
  background-image: url("images/l9.jpg");
  background-image: center;
   background-size: 1370px 650px;
  background-repeat: no-repeat;
      
}

.navbar {
  overflow: hidden;
  height: 50;
  width: 85%;
  margin: 0px auto;
  background-color: green;
}

.navbar a {
  float: left;
  font-size: 25px;
  color: white;
  text-align: center;
  padding: 14px 16px;
  text-decoration: none;
}

.dropdown {
  float: left;
  overflow: hidden;
}

.dropdown .dropbtn {
  font-size: 25px;  
  border: none;
  outline: none;
  color: white;
  padding: 14px 16px;
  background-color: inherit;
  font-family: inherit;
  margin: 0;
}

.navbar a:hover, .dropdown:hover .dropbtn {
  background-color: red;
}

.dropdown-content {
  display: none;
  position: absolute;
  background-color: #f9f9f9;
  min-width: 160px;
  box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);
  z-index: 1;
}

.dropdown-content a {
  float: none;
  color: black;
  padding: 12px 16px;
  text-decoration: none;
  display: block;
  text-align: left;
}

.dropdown-content a:hover {
  background-color: #ddd;
}

.dropdown:hover .dropdown-content {
  display: block;
}
</style>
</head>
<body>

<div class="navbar">
    <a href="fhome.jsp">Home&nbsp;</a>
<!--  <a href="#news">Search</a>-->
  <div class="dropdown">
    <button class="dropbtn">Search Book By&nbsp;
      <i class="fa fa-caret-down"></i>
    </button>
    <div class="dropdown-content">
      <a href="FBookName.jsp">Book Name</a>
      <a href="FBandA.jsp">Book Name and Author Name</a>
      <a href="FDandS.jsp">Department & Subject</a>
      <a href="FBook_id.jsp">Book Id</a>
      <a href="ShowAllByDepartment.jsp">Department Name</a>
       <a href="ShowAll.jsp">Show All</a>
       
    </div>
      
    </div>
    <div class="dropdown">
    <button class="dropbtn">Book Record&nbsp;
      <i class="fa fa-caret-down"></i>
    </button>
    <div class="dropdown-content">
      <a href="InsertBook.jsp">Insert</a>
      <a href="DeleteBook.jsp">Delete</a>
      <a href="UpdateBook.jsp">Update</a>
         </div>
      </div>
      <div class="dropdown">
    <button class="dropbtn">Student Record&nbsp;
      <i class="fa fa-caret-down"></i>
    </button>
    <div class="dropdown-content">
      <a href="InsertStud.jsp">Issued</a>
      <a href="Return.jsp">Returned</a>
      <a href="ShowBySId.jsp">Search</a>
      <a href="ShowAllStud.jsp">Show All</a>
      
    </div>
      </div>
    <a href="FAboutUs.jsp">About Us&nbsp;</a>
    <a href="FContactUs.jsp">Contact Us</a>
    <a href="SignOut.jsp"><button style="float: right;">Sign out</button></a>
</div>
    </div>

</body>
</html>
