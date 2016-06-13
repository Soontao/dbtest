function newPub() {
	$('#dlg').dialog('open').dialog('setTitle', 'New User');
	$('#fm').form('clear');
	url = "/publisher/add";
}

function destroyPub() {
	var row = $('#dg').datagrid('getSelected');
	if (row) {
		$.messager.confirm('Confirm', '确认 ?', function(r) {
			if (r) {
				$.ajax({
					url : '/publisher/delete',
					type : 'POST',
					data : row,
					success : function(result) {
						$('#dg').datagrid('reload'); // reload
					}
				});
			}
		});
	}
}

function editPub() {
	var row = $('#dg').datagrid('getSelected');
	if (row) {
		$('#dlg').dialog('open').dialog('setTitle', 'Edit User');
		$('#fm').form('load', row);
		url = "/publisher/update";
	}
}
function savePub() {
	$('#fm').form('submit', {
		url : url,
		onSubmit : function() {
			return true;
		},
		success : function(result) {
			$('#dlg').dialog('close'); 
			$('#dg').datagrid('reload'); 
		}
	});
}