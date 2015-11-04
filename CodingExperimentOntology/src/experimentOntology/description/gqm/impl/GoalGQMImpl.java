/**
 */
package experimentOntology.description.gqm.impl;

import experimentOntology.description.gqm.GoalGQM;
import experimentOntology.description.gqm.GqmPackage;
import experimentOntology.description.gqm.QuestionGQM;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Goal GQM</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link experimentOntology.description.gqm.impl.GoalGQMImpl#getRelatedQuestion <em>Related Question</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GoalGQMImpl extends MinimalEObjectImpl.Container implements GoalGQM {
	/**
	 * The cached value of the '{@link #getRelatedQuestion() <em>Related Question</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedQuestion()
	 * @generated
	 * @ordered
	 */
	protected EList<QuestionGQM> relatedQuestion;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GoalGQMImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GqmPackage.Literals.GOAL_GQM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<QuestionGQM> getRelatedQuestion() {
		if (relatedQuestion == null) {
			relatedQuestion = new EObjectResolvingEList<QuestionGQM>(QuestionGQM.class, this, GqmPackage.GOAL_GQM__RELATED_QUESTION);
		}
		return relatedQuestion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GqmPackage.GOAL_GQM__RELATED_QUESTION:
				return getRelatedQuestion();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GqmPackage.GOAL_GQM__RELATED_QUESTION:
				getRelatedQuestion().clear();
				getRelatedQuestion().addAll((Collection<? extends QuestionGQM>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case GqmPackage.GOAL_GQM__RELATED_QUESTION:
				getRelatedQuestion().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case GqmPackage.GOAL_GQM__RELATED_QUESTION:
				return relatedQuestion != null && !relatedQuestion.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //GoalGQMImpl
