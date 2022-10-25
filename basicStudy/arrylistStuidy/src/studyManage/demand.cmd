/**
 * 需求：
 * 采取控制台的方式去书写学生管理系统。
 * 分析：
 * 初始菜单：
 * -欢迎来到黑马学生管理系统
 * "1:添加学生”
 * "2:删除学生”
 * "3:修改学生"
 * "4:查询学生”
 * "5:退出"
 * "请输入您的选择："
 * 学生类：
 * 属性：id、姓名、年龄、家庭住址
 * 添加功能：
 * 键盘录入每一个学生信息并添加，
 * 需要满足以下要求：
 * id唯一
 * 删除功能：
 * 键盘录入要删除的学生id,需要满足以下要求：
 */
/**
 * 学生管理系统升级版
 * 需求：
 * 为学生管理系统书写一个登陆、注册、忘记密码的功能。
 * 只有用户登录成功之后，才能进入到学生管理系统中进行增删改查操作。
 * 分析：
 * 登录界面：
 * System.out,println("欢迎来到学生管理系统")：
 * System.out,println("请选择操作1登录2注册3忘记密码")：
 * 用户类：
 * 属性：用户名、密码、身份证号码、手机号码
 * 注册功能：
 * 1,用户名需要满足以下要求：
 * 验证要求：
 * 用户名唯一
 * 用户名长度必须在3~15位之间
 * 只能是字母加数字的组合，但是不能是纯数字
 * 2,密码键盘输入两次，两次一致才可以进行注册。
 * 3,身份证号码需要验证。
 * I
 * 验证要求：
 * 长度为18位
 * 不能以0为开头
 * 前17位，必须都是数字
 * 最为一位可以是数字，也可以是大写X或小写×
 * 4,手机号验证。
 * 验证要求：
 * 长度为11位
 * 不能以0为开头
 * 必须都是数字
 * 登录功能：
 * 1,键盘录入用户名
 * 2,键盘录入密码
 * 3,键盘录入验证码
 * 验证要求：
 * 用户名如果未注册，直接结束方法，并提示：用户名未注册，请先注册
 * 判断验证码是否正确，如不正确，重新输入
 * 再判断用户名和密码是否正确，有3次机会
 * 忘记密码：
 * 1,键盘录入用户名，判断当前用户名是否存在，如不存在，直接结束方法，并提示：未注册
 * 2,键盘录入身份证号码和手机号码
 * 3,，判断当前用户的身份证号码和手机号码是否一致，
 * 如果一致，则提示输入密码，进行修改
 * 如果不一致，则提示：账号信息不匹配，修改失败。
 * 验证码规则：
 * 长度为5
 * 由4位大写或者小写字母和1位数字组成，同一个字母可重复
 * 数字可以出现在任意位置
 * 比如：
 * aQa1K
 */