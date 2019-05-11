<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@include file="Fragments/Header.jsp" %>
    <!-- Button trigger modal -->
   
<button type="button" class="btn btn-primary" data-toggle="modal" data-target="#exampleModal">
  Add Classification
</button>
<!-- Modal -->
<div class="modal fade" id="exampleModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
   
      <div class="modal-header">
        <h5 class="modal-title" id="exampleModalLabel">Add Main Classification</h5>
        
        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
          <span aria-hidden="true">&times;</span>
        </button>
      </div>
      <div class="modal-body">
      
       <form  method="post" id="classificationform">
       <div class="form-group">
       
    <label for="exampleFormControlInput1">Main Classification Name:</label>
    <input type="text" class="form-control" id="exampleFormControlInput1" placeholder="Enter Main Classification" name="classificationName">
   
  </div>
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
        <input type="submit" value="submit"/>
      </div>
       </form>
    </div>
  </div>
</div>


<table class="table table-bordered">
  <thead>
    <tr>
      <th scope="col">#</th>
      <th scope="col">Main Classification</th>
      <th scope="col">Edit/Delete</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <th scope="row">1</th>
      <td>Mark</td>
      <td><button type="button" class="btn btn-success">Edit</button>
      <button type="button" class="btn btn-danger">Delete</button></td>
    </tr>
    
  </tbody>
  
</table>

<script type="text/javascript" src="js/classification.js" >
</script>
<%@include file="Fragments/Footer.jsp" %>