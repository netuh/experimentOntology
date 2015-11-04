/**
 */
package experimentOntology.description.impl;

import experimentOntology.description.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DescriptionFactoryImpl extends EFactoryImpl implements DescriptionFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DescriptionFactory init() {
		try {
			DescriptionFactory theDescriptionFactory = (DescriptionFactory)EPackage.Registry.INSTANCE.getEFactory(DescriptionPackage.eNS_URI);
			if (theDescriptionFactory != null) {
				return theDescriptionFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DescriptionFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DescriptionFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case DescriptionPackage.AUTHOR: return createAuthor();
			case DescriptionPackage.SIMPLE_ABSTRACT: return createSimpleAbstract();
			case DescriptionPackage.STRUCTURED_ABSTRACT: return createStructuredAbstract();
			case DescriptionPackage.KEYWORDS: return createKeywords();
			case DescriptionPackage.TRADITIONAL_DESCRIPTION: return createTraditionalDescription();
			case DescriptionPackage.QUESTIONS: return createQuestions();
			case DescriptionPackage.RESEARCH_HYPOTHESES: return createResearchHypotheses();
			case DescriptionPackage.SIMPLE_GOAL: return createSimpleGoal();
			case DescriptionPackage.STRUCTURED_GOAL: return createStructuredGoal();
			case DescriptionPackage.DESCRIPTION: return createDescription();
			case DescriptionPackage.AUTHORS: return createAuthors();
			case DescriptionPackage.KEYWORD: return createKeyword();
			case DescriptionPackage.SIMPLE_RESEARCH_QUESTION: return createSimpleResearchQuestion();
			case DescriptionPackage.SIMPLE_HYPOTHESIS: return createSimpleHypothesis();
			case DescriptionPackage.GOALS: return createGoals();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Author createAuthor() {
		AuthorImpl author = new AuthorImpl();
		return author;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleAbstract createSimpleAbstract() {
		SimpleAbstractImpl simpleAbstract = new SimpleAbstractImpl();
		return simpleAbstract;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructuredAbstract createStructuredAbstract() {
		StructuredAbstractImpl structuredAbstract = new StructuredAbstractImpl();
		return structuredAbstract;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Keywords createKeywords() {
		KeywordsImpl keywords = new KeywordsImpl();
		return keywords;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TraditionalDescription createTraditionalDescription() {
		TraditionalDescriptionImpl traditionalDescription = new TraditionalDescriptionImpl();
		return traditionalDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Questions createQuestions() {
		QuestionsImpl questions = new QuestionsImpl();
		return questions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResearchHypotheses createResearchHypotheses() {
		ResearchHypothesesImpl researchHypotheses = new ResearchHypothesesImpl();
		return researchHypotheses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleGoal createSimpleGoal() {
		SimpleGoalImpl simpleGoal = new SimpleGoalImpl();
		return simpleGoal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructuredGoal createStructuredGoal() {
		StructuredGoalImpl structuredGoal = new StructuredGoalImpl();
		return structuredGoal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Description createDescription() {
		DescriptionImpl description = new DescriptionImpl();
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Authors createAuthors() {
		AuthorsImpl authors = new AuthorsImpl();
		return authors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Keyword createKeyword() {
		KeywordImpl keyword = new KeywordImpl();
		return keyword;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleResearchQuestion createSimpleResearchQuestion() {
		SimpleResearchQuestionImpl simpleResearchQuestion = new SimpleResearchQuestionImpl();
		return simpleResearchQuestion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleHypothesis createSimpleHypothesis() {
		SimpleHypothesisImpl simpleHypothesis = new SimpleHypothesisImpl();
		return simpleHypothesis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Goals createGoals() {
		GoalsImpl goals = new GoalsImpl();
		return goals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DescriptionPackage getDescriptionPackage() {
		return (DescriptionPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DescriptionPackage getPackage() {
		return DescriptionPackage.eINSTANCE;
	}

} //DescriptionFactoryImpl
