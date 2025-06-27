<!-- src/routes/developer/+page.svelte -->
<script>
    export let data;
</script>

<h1 class="text-2xl font-bold text-blue-600">개발자 정보</h1>
<p>이름: {data.developer.name}</p>
<p>역할: {data.developer.role}</p>
<p>스킬: {data.developer.skills.join(', ')}</p>