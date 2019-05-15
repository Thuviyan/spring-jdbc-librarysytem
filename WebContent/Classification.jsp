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
        <button type="submit" value="submit" class="btn btn-primary" >Save</button>
      </div>
       </form>
    </div>
  </div>
</div>


<table class="table table-bordered" id="showtable">
  <thead>
    <tr>
      <th scope="col">#</th>
      <th scope="col">Main Classification</th>
      <th scope="col">Edit/Delete</th>
    </tr>
  </thead>
  <tbody>
   
  </tbody>
  
</table>
<script
  src="https://code.jquery.com/jquery-3.4.1.min.js"
  integrity="sha256-CSXorXvZcTkaix6Yvo6HppcZGetbYMGWSFlBw8HfCJo="
  crossorigin="anonymous"></script>
<script type="text/javascript" src="js/classification.js" >
</script>
<%@include file="Fragments/Footer.jsp" %>