/**
 * 
 */

$(function(){
	
	switch(menu){
	
	case 'About':
		$('#about').addClass('active');
		break;
		
		
		
	case 'View Product':
		$('#listProduct').addClass('active');
		break;
		
		
		
	case 'Contact':
		$('#contact').addClass('active');
		break;
		
		
		
	default:
		$('#listProduct').addClass('active');
	   $('#a_'+menu).addClass('active');
		break;
	}
	
	
})


// code for jquery data
//create a datasete 

var products=[
	['1','ABC'],
	['2','cde'],
	['3','ghC'],
	['4','ijk']
	
	
];

var $table=$('#productListTable');


if($table.length){
	$table.DataTable({
		lengthmenu:[[3,5,10,-1],['3 records','5 records','10 records','All']],
		pagelength:5,
		data:products
	});
	
	
}
