/**
 */
package experimentOntology.description;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see experimentOntology.description.DescriptionFactory
 * @model kind="package"
 * @generated
 */
public interface DescriptionPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "description";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/description";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "description";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DescriptionPackage eINSTANCE = experimentOntology.description.impl.DescriptionPackageImpl.init();

	/**
	 * The meta object id for the '{@link experimentOntology.description.impl.DescribableImpl <em>Describable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see experimentOntology.description.impl.DescribableImpl
	 * @see experimentOntology.description.impl.DescriptionPackageImpl#getDescribable()
	 * @generated
	 */
	int DESCRIBABLE = 0;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIBABLE__ABSTRACT = 0;

	/**
	 * The feature id for the '<em><b>Keywords</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIBABLE__KEYWORDS = 1;

	/**
	 * The feature id for the '<em><b>Authorship</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIBABLE__AUTHORSHIP = 2;

	/**
	 * The number of structural features of the '<em>Describable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIBABLE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Describable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIBABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link experimentOntology.description.impl.AuthorImpl <em>Author</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see experimentOntology.description.impl.AuthorImpl
	 * @see experimentOntology.description.impl.DescriptionPackageImpl#getAuthor()
	 * @generated
	 */
	int AUTHOR = 1;

	/**
	 * The number of structural features of the '<em>Author</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHOR_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Author</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link experimentOntology.description.impl.AbstractImpl <em>Abstract</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see experimentOntology.description.impl.AbstractImpl
	 * @see experimentOntology.description.impl.DescriptionPackageImpl#getAbstract()
	 * @generated
	 */
	int ABSTRACT = 2;

	/**
	 * The number of structural features of the '<em>Abstract</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Abstract</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link experimentOntology.description.impl.SimpleAbstractImpl <em>Simple Abstract</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see experimentOntology.description.impl.SimpleAbstractImpl
	 * @see experimentOntology.description.impl.DescriptionPackageImpl#getSimpleAbstract()
	 * @generated
	 */
	int SIMPLE_ABSTRACT = 3;

	/**
	 * The number of structural features of the '<em>Simple Abstract</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_ABSTRACT_FEATURE_COUNT = ABSTRACT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Simple Abstract</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_ABSTRACT_OPERATION_COUNT = ABSTRACT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link experimentOntology.description.impl.StructuredAbstractImpl <em>Structured Abstract</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see experimentOntology.description.impl.StructuredAbstractImpl
	 * @see experimentOntology.description.impl.DescriptionPackageImpl#getStructuredAbstract()
	 * @generated
	 */
	int STRUCTURED_ABSTRACT = 4;

	/**
	 * The number of structural features of the '<em>Structured Abstract</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_ABSTRACT_FEATURE_COUNT = ABSTRACT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Structured Abstract</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_ABSTRACT_OPERATION_COUNT = ABSTRACT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link experimentOntology.description.impl.KeywordsImpl <em>Keywords</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see experimentOntology.description.impl.KeywordsImpl
	 * @see experimentOntology.description.impl.DescriptionPackageImpl#getKeywords()
	 * @generated
	 */
	int KEYWORDS = 5;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYWORDS__CONTENT = 0;

	/**
	 * The number of structural features of the '<em>Keywords</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYWORDS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Keywords</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYWORDS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link experimentOntology.description.impl.TraditionalDescriptionImpl <em>Traditional Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see experimentOntology.description.impl.TraditionalDescriptionImpl
	 * @see experimentOntology.description.impl.DescriptionPackageImpl#getTraditionalDescription()
	 * @generated
	 */
	int TRADITIONAL_DESCRIPTION = 6;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRADITIONAL_DESCRIPTION__ABSTRACT = DESCRIBABLE__ABSTRACT;

	/**
	 * The feature id for the '<em><b>Keywords</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRADITIONAL_DESCRIPTION__KEYWORDS = DESCRIBABLE__KEYWORDS;

	/**
	 * The feature id for the '<em><b>Authorship</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRADITIONAL_DESCRIPTION__AUTHORSHIP = DESCRIBABLE__AUTHORSHIP;

	/**
	 * The feature id for the '<em><b>Questions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRADITIONAL_DESCRIPTION__QUESTIONS = DESCRIBABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Hypothesis</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRADITIONAL_DESCRIPTION__HYPOTHESIS = DESCRIBABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Goals</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRADITIONAL_DESCRIPTION__GOALS = DESCRIBABLE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Traditional Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRADITIONAL_DESCRIPTION_FEATURE_COUNT = DESCRIBABLE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Traditional Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRADITIONAL_DESCRIPTION_OPERATION_COUNT = DESCRIBABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link experimentOntology.description.impl.QuestionsImpl <em>Questions</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see experimentOntology.description.impl.QuestionsImpl
	 * @see experimentOntology.description.impl.DescriptionPackageImpl#getQuestions()
	 * @generated
	 */
	int QUESTIONS = 7;

	/**
	 * The feature id for the '<em><b>Research Questions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTIONS__RESEARCH_QUESTIONS = 0;

	/**
	 * The number of structural features of the '<em>Questions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTIONS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Questions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTIONS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link experimentOntology.description.impl.GoalImpl <em>Goal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see experimentOntology.description.impl.GoalImpl
	 * @see experimentOntology.description.impl.DescriptionPackageImpl#getGoal()
	 * @generated
	 */
	int GOAL = 8;

	/**
	 * The number of structural features of the '<em>Goal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Goal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link experimentOntology.description.impl.ResearchHypothesesImpl <em>Research Hypotheses</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see experimentOntology.description.impl.ResearchHypothesesImpl
	 * @see experimentOntology.description.impl.DescriptionPackageImpl#getResearchHypotheses()
	 * @generated
	 */
	int RESEARCH_HYPOTHESES = 9;

	/**
	 * The feature id for the '<em><b>Hypotheses</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESEARCH_HYPOTHESES__HYPOTHESES = 0;

	/**
	 * The number of structural features of the '<em>Research Hypotheses</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESEARCH_HYPOTHESES_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Research Hypotheses</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESEARCH_HYPOTHESES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link experimentOntology.description.impl.SimpleGoalImpl <em>Simple Goal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see experimentOntology.description.impl.SimpleGoalImpl
	 * @see experimentOntology.description.impl.DescriptionPackageImpl#getSimpleGoal()
	 * @generated
	 */
	int SIMPLE_GOAL = 10;

	/**
	 * The number of structural features of the '<em>Simple Goal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_GOAL_FEATURE_COUNT = GOAL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Simple Goal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_GOAL_OPERATION_COUNT = GOAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link experimentOntology.description.impl.StructuredGoalImpl <em>Structured Goal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see experimentOntology.description.impl.StructuredGoalImpl
	 * @see experimentOntology.description.impl.DescriptionPackageImpl#getStructuredGoal()
	 * @generated
	 */
	int STRUCTURED_GOAL = 11;

	/**
	 * The number of structural features of the '<em>Structured Goal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_GOAL_FEATURE_COUNT = GOAL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Structured Goal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_GOAL_OPERATION_COUNT = GOAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link experimentOntology.description.impl.DescriptionImpl <em>Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see experimentOntology.description.impl.DescriptionImpl
	 * @see experimentOntology.description.impl.DescriptionPackageImpl#getDescription()
	 * @generated
	 */
	int DESCRIPTION = 12;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION__DESCRIPTION = 0;

	/**
	 * The number of structural features of the '<em>Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link experimentOntology.description.impl.AuthorsImpl <em>Authors</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see experimentOntology.description.impl.AuthorsImpl
	 * @see experimentOntology.description.impl.DescriptionPackageImpl#getAuthors()
	 * @generated
	 */
	int AUTHORS = 13;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORS__AUTHOR = 0;

	/**
	 * The number of structural features of the '<em>Authors</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Authors</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link experimentOntology.description.impl.KeywordImpl <em>Keyword</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see experimentOntology.description.impl.KeywordImpl
	 * @see experimentOntology.description.impl.DescriptionPackageImpl#getKeyword()
	 * @generated
	 */
	int KEYWORD = 14;

	/**
	 * The number of structural features of the '<em>Keyword</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYWORD_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Keyword</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYWORD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link experimentOntology.description.impl.SimpleResearchQuestionImpl <em>Simple Research Question</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see experimentOntology.description.impl.SimpleResearchQuestionImpl
	 * @see experimentOntology.description.impl.DescriptionPackageImpl#getSimpleResearchQuestion()
	 * @generated
	 */
	int SIMPLE_RESEARCH_QUESTION = 15;

	/**
	 * The number of structural features of the '<em>Simple Research Question</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_RESEARCH_QUESTION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Simple Research Question</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_RESEARCH_QUESTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link experimentOntology.description.impl.SimpleHypothesisImpl <em>Simple Hypothesis</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see experimentOntology.description.impl.SimpleHypothesisImpl
	 * @see experimentOntology.description.impl.DescriptionPackageImpl#getSimpleHypothesis()
	 * @generated
	 */
	int SIMPLE_HYPOTHESIS = 16;

	/**
	 * The number of structural features of the '<em>Simple Hypothesis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_HYPOTHESIS_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Simple Hypothesis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_HYPOTHESIS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link experimentOntology.description.impl.GoalsImpl <em>Goals</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see experimentOntology.description.impl.GoalsImpl
	 * @see experimentOntology.description.impl.DescriptionPackageImpl#getGoals()
	 * @generated
	 */
	int GOALS = 17;

	/**
	 * The feature id for the '<em><b>Goal</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOALS__GOAL = 0;

	/**
	 * The number of structural features of the '<em>Goals</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOALS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Goals</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOALS_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link experimentOntology.description.Describable <em>Describable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Describable</em>'.
	 * @see experimentOntology.description.Describable
	 * @generated
	 */
	EClass getDescribable();

	/**
	 * Returns the meta object for the containment reference '{@link experimentOntology.description.Describable#getAbstract <em>Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Abstract</em>'.
	 * @see experimentOntology.description.Describable#getAbstract()
	 * @see #getDescribable()
	 * @generated
	 */
	EReference getDescribable_Abstract();

	/**
	 * Returns the meta object for the containment reference '{@link experimentOntology.description.Describable#getKeywords <em>Keywords</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Keywords</em>'.
	 * @see experimentOntology.description.Describable#getKeywords()
	 * @see #getDescribable()
	 * @generated
	 */
	EReference getDescribable_Keywords();

	/**
	 * Returns the meta object for the containment reference '{@link experimentOntology.description.Describable#getAuthorship <em>Authorship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Authorship</em>'.
	 * @see experimentOntology.description.Describable#getAuthorship()
	 * @see #getDescribable()
	 * @generated
	 */
	EReference getDescribable_Authorship();

	/**
	 * Returns the meta object for class '{@link experimentOntology.description.Author <em>Author</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Author</em>'.
	 * @see experimentOntology.description.Author
	 * @generated
	 */
	EClass getAuthor();

	/**
	 * Returns the meta object for class '{@link experimentOntology.description.Abstract <em>Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract</em>'.
	 * @see experimentOntology.description.Abstract
	 * @generated
	 */
	EClass getAbstract();

	/**
	 * Returns the meta object for class '{@link experimentOntology.description.SimpleAbstract <em>Simple Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Abstract</em>'.
	 * @see experimentOntology.description.SimpleAbstract
	 * @generated
	 */
	EClass getSimpleAbstract();

	/**
	 * Returns the meta object for class '{@link experimentOntology.description.StructuredAbstract <em>Structured Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Structured Abstract</em>'.
	 * @see experimentOntology.description.StructuredAbstract
	 * @generated
	 */
	EClass getStructuredAbstract();

	/**
	 * Returns the meta object for class '{@link experimentOntology.description.Keywords <em>Keywords</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Keywords</em>'.
	 * @see experimentOntology.description.Keywords
	 * @generated
	 */
	EClass getKeywords();

	/**
	 * Returns the meta object for the containment reference list '{@link experimentOntology.description.Keywords#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Content</em>'.
	 * @see experimentOntology.description.Keywords#getContent()
	 * @see #getKeywords()
	 * @generated
	 */
	EReference getKeywords_Content();

	/**
	 * Returns the meta object for class '{@link experimentOntology.description.TraditionalDescription <em>Traditional Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traditional Description</em>'.
	 * @see experimentOntology.description.TraditionalDescription
	 * @generated
	 */
	EClass getTraditionalDescription();

	/**
	 * Returns the meta object for the containment reference '{@link experimentOntology.description.TraditionalDescription#getQuestions <em>Questions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Questions</em>'.
	 * @see experimentOntology.description.TraditionalDescription#getQuestions()
	 * @see #getTraditionalDescription()
	 * @generated
	 */
	EReference getTraditionalDescription_Questions();

	/**
	 * Returns the meta object for the containment reference '{@link experimentOntology.description.TraditionalDescription#getHypothesis <em>Hypothesis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Hypothesis</em>'.
	 * @see experimentOntology.description.TraditionalDescription#getHypothesis()
	 * @see #getTraditionalDescription()
	 * @generated
	 */
	EReference getTraditionalDescription_Hypothesis();

	/**
	 * Returns the meta object for the containment reference '{@link experimentOntology.description.TraditionalDescription#getGoals <em>Goals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Goals</em>'.
	 * @see experimentOntology.description.TraditionalDescription#getGoals()
	 * @see #getTraditionalDescription()
	 * @generated
	 */
	EReference getTraditionalDescription_Goals();

	/**
	 * Returns the meta object for class '{@link experimentOntology.description.Questions <em>Questions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Questions</em>'.
	 * @see experimentOntology.description.Questions
	 * @generated
	 */
	EClass getQuestions();

	/**
	 * Returns the meta object for the containment reference list '{@link experimentOntology.description.Questions#getResearchQuestions <em>Research Questions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Research Questions</em>'.
	 * @see experimentOntology.description.Questions#getResearchQuestions()
	 * @see #getQuestions()
	 * @generated
	 */
	EReference getQuestions_ResearchQuestions();

	/**
	 * Returns the meta object for class '{@link experimentOntology.description.Goal <em>Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Goal</em>'.
	 * @see experimentOntology.description.Goal
	 * @generated
	 */
	EClass getGoal();

	/**
	 * Returns the meta object for class '{@link experimentOntology.description.ResearchHypotheses <em>Research Hypotheses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Research Hypotheses</em>'.
	 * @see experimentOntology.description.ResearchHypotheses
	 * @generated
	 */
	EClass getResearchHypotheses();

	/**
	 * Returns the meta object for the containment reference list '{@link experimentOntology.description.ResearchHypotheses#getHypotheses <em>Hypotheses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Hypotheses</em>'.
	 * @see experimentOntology.description.ResearchHypotheses#getHypotheses()
	 * @see #getResearchHypotheses()
	 * @generated
	 */
	EReference getResearchHypotheses_Hypotheses();

	/**
	 * Returns the meta object for class '{@link experimentOntology.description.SimpleGoal <em>Simple Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Goal</em>'.
	 * @see experimentOntology.description.SimpleGoal
	 * @generated
	 */
	EClass getSimpleGoal();

	/**
	 * Returns the meta object for class '{@link experimentOntology.description.StructuredGoal <em>Structured Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Structured Goal</em>'.
	 * @see experimentOntology.description.StructuredGoal
	 * @generated
	 */
	EClass getStructuredGoal();

	/**
	 * Returns the meta object for class '{@link experimentOntology.description.Description <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Description</em>'.
	 * @see experimentOntology.description.Description
	 * @generated
	 */
	EClass getDescription();

	/**
	 * Returns the meta object for the containment reference '{@link experimentOntology.description.Description#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see experimentOntology.description.Description#getDescription()
	 * @see #getDescription()
	 * @generated
	 */
	EReference getDescription_Description();

	/**
	 * Returns the meta object for class '{@link experimentOntology.description.Authors <em>Authors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Authors</em>'.
	 * @see experimentOntology.description.Authors
	 * @generated
	 */
	EClass getAuthors();

	/**
	 * Returns the meta object for the containment reference list '{@link experimentOntology.description.Authors#getAuthor <em>Author</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Author</em>'.
	 * @see experimentOntology.description.Authors#getAuthor()
	 * @see #getAuthors()
	 * @generated
	 */
	EReference getAuthors_Author();

	/**
	 * Returns the meta object for class '{@link experimentOntology.description.Keyword <em>Keyword</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Keyword</em>'.
	 * @see experimentOntology.description.Keyword
	 * @generated
	 */
	EClass getKeyword();

	/**
	 * Returns the meta object for class '{@link experimentOntology.description.SimpleResearchQuestion <em>Simple Research Question</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Research Question</em>'.
	 * @see experimentOntology.description.SimpleResearchQuestion
	 * @generated
	 */
	EClass getSimpleResearchQuestion();

	/**
	 * Returns the meta object for class '{@link experimentOntology.description.SimpleHypothesis <em>Simple Hypothesis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Hypothesis</em>'.
	 * @see experimentOntology.description.SimpleHypothesis
	 * @generated
	 */
	EClass getSimpleHypothesis();

	/**
	 * Returns the meta object for class '{@link experimentOntology.description.Goals <em>Goals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Goals</em>'.
	 * @see experimentOntology.description.Goals
	 * @generated
	 */
	EClass getGoals();

	/**
	 * Returns the meta object for the containment reference list '{@link experimentOntology.description.Goals#getGoal <em>Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Goal</em>'.
	 * @see experimentOntology.description.Goals#getGoal()
	 * @see #getGoals()
	 * @generated
	 */
	EReference getGoals_Goal();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DescriptionFactory getDescriptionFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link experimentOntology.description.impl.DescribableImpl <em>Describable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see experimentOntology.description.impl.DescribableImpl
		 * @see experimentOntology.description.impl.DescriptionPackageImpl#getDescribable()
		 * @generated
		 */
		EClass DESCRIBABLE = eINSTANCE.getDescribable();

		/**
		 * The meta object literal for the '<em><b>Abstract</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DESCRIBABLE__ABSTRACT = eINSTANCE.getDescribable_Abstract();

		/**
		 * The meta object literal for the '<em><b>Keywords</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DESCRIBABLE__KEYWORDS = eINSTANCE.getDescribable_Keywords();

		/**
		 * The meta object literal for the '<em><b>Authorship</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DESCRIBABLE__AUTHORSHIP = eINSTANCE.getDescribable_Authorship();

		/**
		 * The meta object literal for the '{@link experimentOntology.description.impl.AuthorImpl <em>Author</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see experimentOntology.description.impl.AuthorImpl
		 * @see experimentOntology.description.impl.DescriptionPackageImpl#getAuthor()
		 * @generated
		 */
		EClass AUTHOR = eINSTANCE.getAuthor();

		/**
		 * The meta object literal for the '{@link experimentOntology.description.impl.AbstractImpl <em>Abstract</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see experimentOntology.description.impl.AbstractImpl
		 * @see experimentOntology.description.impl.DescriptionPackageImpl#getAbstract()
		 * @generated
		 */
		EClass ABSTRACT = eINSTANCE.getAbstract();

		/**
		 * The meta object literal for the '{@link experimentOntology.description.impl.SimpleAbstractImpl <em>Simple Abstract</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see experimentOntology.description.impl.SimpleAbstractImpl
		 * @see experimentOntology.description.impl.DescriptionPackageImpl#getSimpleAbstract()
		 * @generated
		 */
		EClass SIMPLE_ABSTRACT = eINSTANCE.getSimpleAbstract();

		/**
		 * The meta object literal for the '{@link experimentOntology.description.impl.StructuredAbstractImpl <em>Structured Abstract</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see experimentOntology.description.impl.StructuredAbstractImpl
		 * @see experimentOntology.description.impl.DescriptionPackageImpl#getStructuredAbstract()
		 * @generated
		 */
		EClass STRUCTURED_ABSTRACT = eINSTANCE.getStructuredAbstract();

		/**
		 * The meta object literal for the '{@link experimentOntology.description.impl.KeywordsImpl <em>Keywords</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see experimentOntology.description.impl.KeywordsImpl
		 * @see experimentOntology.description.impl.DescriptionPackageImpl#getKeywords()
		 * @generated
		 */
		EClass KEYWORDS = eINSTANCE.getKeywords();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KEYWORDS__CONTENT = eINSTANCE.getKeywords_Content();

		/**
		 * The meta object literal for the '{@link experimentOntology.description.impl.TraditionalDescriptionImpl <em>Traditional Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see experimentOntology.description.impl.TraditionalDescriptionImpl
		 * @see experimentOntology.description.impl.DescriptionPackageImpl#getTraditionalDescription()
		 * @generated
		 */
		EClass TRADITIONAL_DESCRIPTION = eINSTANCE.getTraditionalDescription();

		/**
		 * The meta object literal for the '<em><b>Questions</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRADITIONAL_DESCRIPTION__QUESTIONS = eINSTANCE.getTraditionalDescription_Questions();

		/**
		 * The meta object literal for the '<em><b>Hypothesis</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRADITIONAL_DESCRIPTION__HYPOTHESIS = eINSTANCE.getTraditionalDescription_Hypothesis();

		/**
		 * The meta object literal for the '<em><b>Goals</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRADITIONAL_DESCRIPTION__GOALS = eINSTANCE.getTraditionalDescription_Goals();

		/**
		 * The meta object literal for the '{@link experimentOntology.description.impl.QuestionsImpl <em>Questions</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see experimentOntology.description.impl.QuestionsImpl
		 * @see experimentOntology.description.impl.DescriptionPackageImpl#getQuestions()
		 * @generated
		 */
		EClass QUESTIONS = eINSTANCE.getQuestions();

		/**
		 * The meta object literal for the '<em><b>Research Questions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUESTIONS__RESEARCH_QUESTIONS = eINSTANCE.getQuestions_ResearchQuestions();

		/**
		 * The meta object literal for the '{@link experimentOntology.description.impl.GoalImpl <em>Goal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see experimentOntology.description.impl.GoalImpl
		 * @see experimentOntology.description.impl.DescriptionPackageImpl#getGoal()
		 * @generated
		 */
		EClass GOAL = eINSTANCE.getGoal();

		/**
		 * The meta object literal for the '{@link experimentOntology.description.impl.ResearchHypothesesImpl <em>Research Hypotheses</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see experimentOntology.description.impl.ResearchHypothesesImpl
		 * @see experimentOntology.description.impl.DescriptionPackageImpl#getResearchHypotheses()
		 * @generated
		 */
		EClass RESEARCH_HYPOTHESES = eINSTANCE.getResearchHypotheses();

		/**
		 * The meta object literal for the '<em><b>Hypotheses</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESEARCH_HYPOTHESES__HYPOTHESES = eINSTANCE.getResearchHypotheses_Hypotheses();

		/**
		 * The meta object literal for the '{@link experimentOntology.description.impl.SimpleGoalImpl <em>Simple Goal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see experimentOntology.description.impl.SimpleGoalImpl
		 * @see experimentOntology.description.impl.DescriptionPackageImpl#getSimpleGoal()
		 * @generated
		 */
		EClass SIMPLE_GOAL = eINSTANCE.getSimpleGoal();

		/**
		 * The meta object literal for the '{@link experimentOntology.description.impl.StructuredGoalImpl <em>Structured Goal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see experimentOntology.description.impl.StructuredGoalImpl
		 * @see experimentOntology.description.impl.DescriptionPackageImpl#getStructuredGoal()
		 * @generated
		 */
		EClass STRUCTURED_GOAL = eINSTANCE.getStructuredGoal();

		/**
		 * The meta object literal for the '{@link experimentOntology.description.impl.DescriptionImpl <em>Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see experimentOntology.description.impl.DescriptionImpl
		 * @see experimentOntology.description.impl.DescriptionPackageImpl#getDescription()
		 * @generated
		 */
		EClass DESCRIPTION = eINSTANCE.getDescription();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DESCRIPTION__DESCRIPTION = eINSTANCE.getDescription_Description();

		/**
		 * The meta object literal for the '{@link experimentOntology.description.impl.AuthorsImpl <em>Authors</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see experimentOntology.description.impl.AuthorsImpl
		 * @see experimentOntology.description.impl.DescriptionPackageImpl#getAuthors()
		 * @generated
		 */
		EClass AUTHORS = eINSTANCE.getAuthors();

		/**
		 * The meta object literal for the '<em><b>Author</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUTHORS__AUTHOR = eINSTANCE.getAuthors_Author();

		/**
		 * The meta object literal for the '{@link experimentOntology.description.impl.KeywordImpl <em>Keyword</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see experimentOntology.description.impl.KeywordImpl
		 * @see experimentOntology.description.impl.DescriptionPackageImpl#getKeyword()
		 * @generated
		 */
		EClass KEYWORD = eINSTANCE.getKeyword();

		/**
		 * The meta object literal for the '{@link experimentOntology.description.impl.SimpleResearchQuestionImpl <em>Simple Research Question</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see experimentOntology.description.impl.SimpleResearchQuestionImpl
		 * @see experimentOntology.description.impl.DescriptionPackageImpl#getSimpleResearchQuestion()
		 * @generated
		 */
		EClass SIMPLE_RESEARCH_QUESTION = eINSTANCE.getSimpleResearchQuestion();

		/**
		 * The meta object literal for the '{@link experimentOntology.description.impl.SimpleHypothesisImpl <em>Simple Hypothesis</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see experimentOntology.description.impl.SimpleHypothesisImpl
		 * @see experimentOntology.description.impl.DescriptionPackageImpl#getSimpleHypothesis()
		 * @generated
		 */
		EClass SIMPLE_HYPOTHESIS = eINSTANCE.getSimpleHypothesis();

		/**
		 * The meta object literal for the '{@link experimentOntology.description.impl.GoalsImpl <em>Goals</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see experimentOntology.description.impl.GoalsImpl
		 * @see experimentOntology.description.impl.DescriptionPackageImpl#getGoals()
		 * @generated
		 */
		EClass GOALS = eINSTANCE.getGoals();

		/**
		 * The meta object literal for the '<em><b>Goal</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GOALS__GOAL = eINSTANCE.getGoals_Goal();

	}

} //DescriptionPackage
