<!-- src/routes/designer/+page.svelte -->
<script>
    export let data;
</script>

<h1 class="text-2xl font-bold text-pink-600">디자이너 정보</h1>
<p>이름: {data.designer.name}</p>
<p>역할: {data.designer.role}</p>
<p>툴: {data.designer.tools.join(', ')}</p>