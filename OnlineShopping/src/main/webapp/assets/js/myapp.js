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
		$('#home').addClass('active');
		break;
	}
	
	
})