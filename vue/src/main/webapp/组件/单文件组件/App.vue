<template>
	<div>
		<School></School>
		<Student></Student>
	</div>
</template>

<script>
	//引入组件
	import School from './School.前端.vue'
	import Student from './Student.前端.vue'

	export default {
		name:'App',
		components:{
			School,
			Student
		}
	}
</script>
