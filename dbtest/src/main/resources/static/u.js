function newUser() {
	$('#dlg').dialog('open').dialog('setTitle', 'New User');
	$('#fm').form('clear');
	url = "/user/add";
}

function destroyUser() {
	var row = $('#dg').datagrid('getSelected');
	if (row) {
		$.messager.confirm('Confirm', '确认 ?', function(r) {
			if (r) {
				$.ajax({
					url : '/user/delete',
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

function editUser() {
	var row = $('#dg').datagrid('getSelected');
	if (row) {
		$('#dlg').dialog('open').dialog('setTitle', 'Edit User');
		$('#fm').form('load', row);
		url = "/user/update";
	}
}
function saveUser() {
	$('#fm').form('submit', {
		url : url,
		onSubmit : function() {
			return true;
		},
		success : function(result) {
			$('#dlg').dialog('close'); // close the dialog
			$('#dg').datagrid('reload'); // reload the user data
		}
	});
}