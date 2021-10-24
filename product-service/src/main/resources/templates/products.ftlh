<#import "base.ftlh" as base>

<@base.layout>

    <h2 style="text-align: center; font-size: 50px">Products</h2>
    <h2 style="text-align: center">Add product</h2>

    <div class="add">
        <form class="form_categories" action="/products/addProduct" method="post"  enctype="multipart/form-data">
            <label for="">
                Name of product:
                <input class="form__input" type="text" name="name" required>
            </label>
            <label for="">
                Price
                <input class="form__input" type="text" name="price" required>
            </label>
            <label for="">
                Amount
                <input class="form__input" type="number" name="quantity" required>
            </label>
                Description
            <label for="">
                <textarea style="margin-right: 10px" name="description" id="" placeholder="Description"></textarea>
            </label>
            <label for="">
                Upload photo
                <input type="file" id="file" name="file">
            </label>
            <button type="submit">Add product</button>
        </form>
    </div>

    <br>
    <br>
    <br>

    <div>
        <form id="search" action="/products">
            <#if keyword??>
                <input type="text" name="keyword" value="${keyword}"/>
            <#else >
                <input type="text" style="width: 400px" name="keyword" placeholder="search items by name, description, price"/>
            </#if>
            <input type="submit" value="search" />
        </form>
    </div>


<#--    <script>-->
<#--        let allItems = $(".flex__wrapp");-->
<#--        let names = $(".name");-->
<#--        let itemsHtml = $(".item");-->
<#--        $("#search").on("submit", (e) => {-->
<#--            e.preventDefault();-->
<#--            console.log("TEST")-->
<#--            notGood();-->
<#--        });-->

<#--        async function searchItem() {-->
<#--            // $("#items").empty();-->
<#--            // $.get('http://localhost:8001/searching?search=' + search, function (data) {-->
<#--            //     console.log(data[0].id)-->
<#--            // })-->
<#--            const response = await axios.get(`http://localhost:8001/searching?search=` + search.trim())-->
<#--            console.log(response.data)-->
<#--        }-->

<#--        function notGood(){-->
<#--            let items = $("#items");-->
<#--            let isFound = false;-->
<#--            let search = $("#searchString").val();-->

<#--            console.log(search.length)-->
<#--            items.empty();-->
<#--            if (search.length === 0) {-->
<#--                for (let i = 0; i < allItems.length; i++) {-->
<#--                    items.append(allItems[i]);-->
<#--                }-->
<#--                isFound = true;-->
<#--            }-->
<#--            else {-->
<#--                for (let i = 0; i < names.length; i++) {-->
<#--                    if (names.eq(i).text().includes(search) || descriptions.eq(i).text().includes(search)) {-->
<#--                        items.append(itemsHtml[i]);-->
<#--                        isFound = true;-->
<#--                    }-->
<#--                }-->
<#--            }-->
<#--            if (!isFound) {-->
<#--                let result = $("<h3>Товар не найден</h3>");-->
<#--                items.prepend(result);-->
<#--            }-->
<#--        }-->
<#--    </script>-->
</@base.layout>
