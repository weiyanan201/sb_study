两种方式:

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes={TestConfig.class})
@ActiveProfiles("prod")


@RunWith(SpringRunner.class)
@ContextConfiguration(classes = {TestConfig.class})
@SpringBootTest
@Profile("dev")

