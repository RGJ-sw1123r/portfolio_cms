<!-- src/routes/+layout.svelte -->
<script>
    import { getStores } from '$app/stores';
    import '../app.css';
    const { page } = getStores();
</script>

<nav class="fixed top-0 left-0 right-0 h-14 bg-gray-900 flex items-center gap-8 px-8 z-50 text-white">
    <a href="/" class="font-bold hover:opacity-100 opacity-70 border-b-2" class:opacity-100={$page.url.pathname === '/'}>
        DevTeam
    </a>
    <a href="/designer" class="font-bold hover:opacity-100 opacity-70 border-b-2" class:opacity-100={$page.url.pathname === '/designer'}>
        디자이너 소개
    </a>
    <a href="/developer" class="font-bold hover:opacity-100 opacity-70 border-b-2" class:opacity-100={$page.url.pathname === '/developer'}>
        개발자 소개
    </a>
</nav>

<main class="pt-20 px-8 font-sans">
    <slot />
</main>
