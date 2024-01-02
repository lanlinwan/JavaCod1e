<%--
  Created by IntelliJ IDEA.
  User: 蓝
  Date: 2023/6/7
  Time: 10:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="Access-Control-Allow-Origin" content="*">
    <title>Login</title>
    <style>
        .el-table .warning-row {
            background: oldlace;
        }

        .el-table .success-row {
            background: #f0f9eb;
        }
    </style>

</head>

<body>


<div id="app">

    <!--表单-->
    <el-form :inline="true" :model="brand" class="demo-form-inline">
        <el-form-item label="当前状态">
            <el-select v-model="brand.status" placeholder="当前状态">
                <el-option label="启用" value="1"></el-option>
                <el-option label="禁用" value="0"></el-option>
            </el-select>
        </el-form-item>

        <el-form-item label="企业名称">
            <el-input v-model="brand.companyName" placeholder="企业名称"></el-input>
        </el-form-item>

        <el-form-item label="品牌名称">
            <el-input v-model="brand.brandName" placeholder="品牌名称"></el-input>
        </el-form-item>

        <el-form-item>
            <el-button type="primary" @click="onSubmit">查询</el-button>
        </el-form-item>
    </el-form>

    <!--按钮-->
    <el-row>
        <el-button type="danger" plain @click="deleteByIds">批量删除</el-button>
        <el-button type="primary" plain @click="dialogVisible = true"> 新增</el-button>
    </el-row>

    <!--添加数据对话框表达-->
    <el-dialog
            title="编辑品牌"
            :visible.sync="dialogVisible"
            width="30%">


        <el-form ref="form" :model="brand" label-width="80px">
            <el-form-item label="品牌名称">
                <el-input v-model="brand.brandName"></el-input>
            </el-form-item>

            <el-form-item label="企业名称">
                <el-input v-model="brand.companyName"></el-input>
            </el-form-item>

            <el-form-item label="排序">
                <el-input v-model="brand.ordered"></el-input>
            </el-form-item>

            <el-form-item label="备注">
                <el-input type="textarea" v-model="brand.description"></el-input>
            </el-form-item>

            <el-form-item label="状态">
                <el-switch v-model="brand.status"
                           active-value="100"
                           inactive-value="0">
                </el-switch>
            </el-form-item>

            <el-form-item>
                <el-button type="primary" @click="addBrand">提交</el-button>
                <el-button @click="dialogVisible = false">取消</el-button>
            </el-form-item>

        </el-form>

    </el-dialog>

    <!--表格-->
    <template>
        <el-table
                :data="tableData"
                style="width: 100%"
                :row-class-name="tableRowClassName"
                @selection-change="handleSelectionChange">
            <el-table-column
                    type="selection"
                    width="55">
            </el-table-column>
            <el-table-column
                    type="index"
                    width="50">
            </el-table-column>
            <el-table-column
                    align="center"
                    prop="brandName"
                    label="品牌">
            </el-table-column>
            <el-table-column
                    align="center"
                    prop="companyName"
                    label="企业名称"
                    width="180">
            </el-table-column>
            <el-table-column
                    align="center"
                    prop="ordered"
                    label="排序">
            </el-table-column>
            <el-table-column
                    align="center"
                    prop="statusStr"
                    label="当前状态">
            </el-table-column>
            <el-table-column
                    align="center"
                    label="操作">

                <el-row>
                    <el-button type="primary">修改</el-button>
                    <el-button type="danger">删除</el-button>
                </el-row>

            </el-table-column>
        </el-table>
    </template>

    <!--枫叶条-->
    <el-pagination
            @size-change="handleSizeChange"
            @current-change="handleCurrentChange"
            :current-page="currentPage"
            :page-sizes="[5, 10, 15, 20]"
            :page-size="5"
            layout="total, sizes, prev, pager, next, jumper"
            :total="totalCount">
    </el-pagination>

</div>

<script src="js/vue.js"></script>
<script src="element-ui/lib/index.js"></script>
<script src="js/axios.min.js"></script>
<link rel="stylesheet" href="element-ui/lib/theme-chalk/index.css">

<script>

    new Vue({
        el: "#app",
        mounted(){
            //调用查询方法
            this.selectAll()
        },
        methods: {
            //分页查询方法
            selectAll(){
                //页面加载完成后,发送异步请求,获取数据

                axios({
                    method:"post",
                    url:"http://localhost:8080/Comprehensive/brand/selectByPageAndCondition?currentPage="+this.currentPage+"&pageSize="+this.pageSize,
                    data:this.brand
                }).then(resp=>{
                    //设置表格数据
                    this.tableData=resp.data.rows;
                    //设置总记录数
                    this.totalCount=resp.data.totalCount;
                })

            },
            //表格数据
            tableRowClassName({row, rowIndex}) {
                if (rowIndex === 1) {
                    return 'warning-row';
                } else if (rowIndex === 3) {
                    return 'success-row';
                }
                return '';
            },
            //复选框执行后的方法
            handleSelectionChange(val) {
                this.multipleSelection = val;
                console.log(this.multipleSelection)
            },
            //查询方法
            onSubmit() {
                console.log(this.brand);
                //
                this.selectAll();
            },
            //添加数据
            addBrand() {
                //console.log(this.brand);
                //发送ajax请求
                const _this=this;
                axios({
                    method: "post",
                    url:"http://localhost:8080/Comprehensive/brand/add",
                    data:_this.brand
                }).then(function (resp){
                    if(resp.data==="success"){
                        //添加成功
                        //关闭窗口1
                        _this.dialogVisible=false;
                        //重新查询
                        _this.selectAll();
                        //弹出成功信息
                        _this.$message({
                            message:'恭喜你,添加成功',
                            type:'success'
                        });
                    }
                })

            },
            //批删除
            deleteByIds(){
                //弹出确认框
                this.$confirm('此操作将删除该数据, 是否继续?', '提示', {
                    confirmButtonText: '确定',
                    cancelButtonText: '取消',
                    type: 'warning'
                }).then(() => {
                    //点击确认按钮

                    //1.创建id数组 multipleSelection
                    for (let i = 0; i < this.multipleSelection.length; i++) {
                        let selectedElement=this.multipleSelection[i];
                        this.selectedIds[i]=selectedElement.id;
                    }
                    //发送AJAX请求
                    const _this=this;
                    axios({
                        method: "post",
                        url:"http://localhost:8080/Comprehensive/brand/deleteByIds",
                        data:_this.selectedIds
                    }).then(function (resp){
                        if(resp.data=="success"){
                            //删除成功

                            //重新查询
                            _this.selectAll();
                            //弹出成功信息
                            _this.$message({
                                message:'恭喜你,删除成功',
                                type:'success'
                            });

                        }
                    })
                }).catch(() => {
                    //点击取消按钮
                    this.$message({
                        type: 'info',
                        message: '已取消删除'
                    });
                });


            },
            //分页
            handleSizeChange(val) {
                //console.log(`每页 ${val} 条`);
                this.pageSize=val;
                this.selectAll();
            },
            handleCurrentChange(val) {
                //console.log(`当前页: ${val}`);
                this.currentPage=val;
                this.selectAll();

            }
        },
        data() {
            return {
                //每页显示的条数
                pageSize:5,
                //查询总数
                totalCount:100,
                //当前页码
                currentPage: 1,
                //添加数据对话框是否展示标记
                dialogVisible: false,

                //品牌模型数据
                brand: {
                    status: '',
                    brandName: '',
                    companyName: '',
                    id:'',
                    ordered:'',
                    description:''
                },
                //被选中ID数据
                selectedIds:[],
                //复选框选中数据集合
                multipleSelection: [],
                //表格数据
                tableData: [{
                    brandName: '华为',
                    companyName: '华为有限技术公司',
                    ordered: '100',
                    status: "1"
                }, {
                    brandName: '华为',
                    companyName: '华为有限技术公司',
                    ordered: '100',
                    status: "1"
                }, {
                    brandName: '华为',
                    companyName: '华为有限技术公司',
                    ordered: '100',
                    status: "1"
                }, {
                    brandName: '华为',
                    companyName: '华为有限技术公司',
                    ordered: '100',
                    status: "1"
                }]
            }
        }
    })

</script>


</body>
</html>
