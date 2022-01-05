<%--
  Created by IntelliJ IDEA.
  User: hvh08
  Date: 05/01/2022
  Time: 6:42 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
  <head>
    <title>[Bài tập] Hiển thị danh sách khách hàng</title>
    <style>
      table {
        width: 500px;
        border: solid 1px black;
      }
      img {
        width: 100px;
        height: 100px;
      }
    </style>
  </head>
  <body>
  <h3>Danh sách khách hàng</h3>
  <table>
    <tr>
      <th>Tên</th>
      <th>Ngày Sinh</th>
      <th>Địa chỉ</th>
      <th>Ảnh</th>
    </tr>
    <tr>
      <td>Hồ Văn Hưng</td>
      <td>2000-11-08</td>
      <td>Quảng Nam</td>
      <td><img src="https://game8.vn/media/201908/images/iron-man-endgame.jpg"></td>
    </tr><tr>
      <td>Phan Thanh Toàn</td>
      <td>2000-12-27</td>
      <td>Quảng Nam</td>
      <td><img src="https://vnreview.vn/image/19/71/09/1971094.jpg"></td>
    </tr><tr>
      <td>Đặng Văn Hiếu</td>
      <td>2000-09-30</td>
      <td>Quảng Nam</td>
      <td><img src="https://hosonhanvat.net/wp-content/uploads/2019/01/bang-xep-hang-suc-manh-cua-23-nhan-vat-chinh-trong-the-gioi-marvel-tu-yeu-nhat-den-manh-nhat-chua-duoc-phan-loai-4147-e1547825501918.png"></td>
    </tr>
  </table>
  </body>
</html>
