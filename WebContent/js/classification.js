$(document).ready(function(){
	
	fetch_cls()
	$("#classificationform").submit(function(event){
		//event.preventDefault();
		
		console.log($("#classificationform").serialize());
		$.ajax({
			url:'ClassificationControllers',
			type:'post',
			data:$("#classificationform").serialize(),
			success:function(data){
				fetch_cls()
				
			}
		});
	});
	
	
	
	
});

function fetch_cls(){
	//console.log("ege");
$.ajax({
		
		url:"ClassificationControllers",
		type:'get',
		success:function(data){
			console.log(data)
			$.each(data.classifications, function(key,classification){
				var row=`
				<tr>
				<th scope="row">${classification.classification_id}</th>
				<td>${classification.classification_name}</td>
				<td><button class="btn btn-success" data-id="${classification.classification_id}">Delete</button>
				<button class="btn btn-danger" data-id="${classification.classification_id}">Edit</button></td>
				</tr>
				`;
				$("#showtable tbody").append(row);
			})
			}
	});

}

